package com.strong.fee.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * author: 小殊
 * create: 2018/7/4 下午4:50
 */
public class FileReaderUtil {

    private Logger logger = LoggerFactory.getLogger(FileReaderUtil.class);
    private String file;
    private Consumer<List<String>> onReadMessge;
    private Runnable onComplete;

    private final Flux<List<String>> flux;

    public FileReaderUtil(String filePath) {
        this.file = filePath;
        flux = createFlux();
    }

    private Flux<List<String>> createFlux() {

        Flux<List<String>> listFlux = Flux.create(sink -> {
            this.onReadMessge = o -> {
                sink.next(o);
            };
            this.onComplete = () -> {
                sink.complete();
            };

        });
        return listFlux;
    }

    public Flux<List<String>> getFlux() {
        return flux;
    }

    Integer BUFFER_SIZE = 1024;
    Integer ONCE_LINE_SIZE = 10000;

    public void doRead() throws Exception {


        FileInputStream fis = new FileInputStream(file);
        FileChannel channel = fis.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);

        byte[] lastTimeReed = new byte[BUFFER_SIZE * 8];
        byte[] mergeLine = new byte[BUFFER_SIZE * 4];


        int lastTimeReedLength = 0;
        int mergeLiength = 0;

        List<String> lines = new ArrayList<>();
        while (channel.read(buffer) != -1) {

            byte[] thisTimeLine = new byte[buffer.position()];

            buffer.rewind();
            buffer.get(thisTimeLine);
            buffer.clear();

            if (lastTimeReedLength > 0) {
                System.arraycopy(lastTimeReed, 0, mergeLine, 0, lastTimeReedLength);
            }
            try {
                System.arraycopy(thisTimeLine, 0, mergeLine, lastTimeReedLength, thisTimeLine.length);
            } catch (Exception ex) {
                logger.info("{},{}", thisTimeLine.length, lastTimeReedLength);
            }
            mergeLiength = lastTimeReedLength + thisTimeLine.length;

            List<LinePoints> linePoints = getLinesByBuffer(mergeLine, mergeLiength);
            int lastEnd = 0;
            for (LinePoints points : linePoints) {
                String line = new String(mergeLine, points.getStart(), points.getEnd() - points.getStart(), Charset.forName("UTF-8"));
                lines.add(line);
                if (lines.size() == ONCE_LINE_SIZE) {
                    onReadMessge.accept(lines);
                    lines = new ArrayList<>();
                }
                lastEnd = points.getEnd();
            }
            //将多余的放在存放上一次未处理完的缓存里面
            lastEnd = lastEnd == 0 ? 0 : lastEnd + 1;
            if (mergeLiength > lastEnd) {
                try {
                    System.arraycopy(mergeLine, lastEnd, lastTimeReed, 0, mergeLiength - lastEnd);
                } catch (Exception ex) {
                    logger.info("{},{}", mergeLiength, lastEnd);
                }
                lastTimeReedLength = mergeLiength - lastEnd;
            } else {
                lastTimeReedLength = 0;
            }

        }
        if (lines.size() > 0) {
            onReadMessge.accept(lines);
            onComplete.run();
        }

    }

    int LF = 10;//换行符
    int CR = 13;//回车符

    private List<LinePoints> getLinesByBuffer(byte[] bytes, int mergeLiength) {
        List<LinePoints> listResult = new ArrayList<>();
        LinePoints points = new LinePoints();
        points.setStart(0);
        for (int i = 0; i < mergeLiength; i++) {
            if (bytes[i] == LF || bytes[i] == CR) {
                if (bytes[i] == LF || bytes[i] == CR) {
                    i++;

                }
                points.setEnd(i);
                listResult.add(points);

                points = new LinePoints();
                points.setStart(i + 1);
            }
        }

        return listResult;

    }

    class LinePoints {
        private int start;
        private int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }

}
