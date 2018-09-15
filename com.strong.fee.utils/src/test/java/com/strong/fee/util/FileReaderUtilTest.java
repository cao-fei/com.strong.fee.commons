package com.strong.fee.util;/**
 * author: 小殊
 * create: 2018/7/17 上午11:55
 */

import com.strong.fee.util.io.FileReaderUtil;
import org.junit.Test;

/**
 * author: 小殊
 * create: 2018/7/17 上午11:55
 */
public class FileReaderUtilTest {
    @Test
    public void test001() throws Exception {
        FileReaderUtil util = new FileReaderUtil("/Users/caofei/Downloads/jcm_20180710/jcm_20180710.csv");
        util.getFlux().subscribe(o -> o.size());
        util.doRead();
    }
}
