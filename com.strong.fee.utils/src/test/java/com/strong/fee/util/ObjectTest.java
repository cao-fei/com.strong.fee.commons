package com.strong.fee.util;

import com.strong.fee.util.entity.Student;
import com.strong.fee.util.entity.Student2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * author: 小殊
 * create: 2018/7/23 上午10:50
 */
public class ObjectTest {

    Logger logger = LoggerFactory.getLogger(ObjectTest.class);

    @Test
    public void testEquals() {
        Student objectTest = new Student();
        Student objectTest1 = new Student();
        logger.info("equals 判断结果：{}", objectTest.equals(objectTest1));
    }

    @Test
    public void testEquals2() {
        Student2 objectTest = new Student2();
        Student2 objectTest1 = new Student2();
        logger.info("equals 判断结果：{}", objectTest.equals(objectTest1));
    }
    @Test
    public void testHashCode() {
        ObjectTest objectTest = new ObjectTest();
        ObjectTest objectTest1 = new ObjectTest();
        logger.info("equals 判断结果：{},{}", objectTest.hashCode(),objectTest1.hashCode());



        logger.info("equals 判断结果：{},{}", new Object().hashCode(),new Object().hashCode());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(logger, that.logger);
    }

    @Override
    public int hashCode() {

        return Objects.hash(logger);
    }
}
