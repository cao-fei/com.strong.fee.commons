package com.strong.fee.kafka.connector;

import org.apache.kafka.connect.source.SourceRecord;
import org.apache.kafka.connect.source.SourceTask;
import org.apache.kafka.connect.source.SourceTaskContext;

import java.util.List;
import java.util.Map;

public class FileStreamSourceTask extends SourceTask {
    public FileStreamSourceTask() {
        super();
    }

    @Override
    public void initialize(SourceTaskContext context) {
        super.initialize(context);
    }

    @Override
    public void commit() throws InterruptedException {
        super.commit();
    }

    @Override
    public void commitRecord(SourceRecord record) throws InterruptedException {
        super.commitRecord(record);
    }

    @Override
    public void start(Map<String, String> props) {

    }

    @Override
    public List<SourceRecord> poll() throws InterruptedException {
        return null;
    }

    @Override
    public void stop() {

    }

    @Override
    public String version() {
        return "0.0.1";
    }
}
