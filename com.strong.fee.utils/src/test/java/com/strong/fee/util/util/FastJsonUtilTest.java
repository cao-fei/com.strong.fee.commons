package com.strong.fee.util.util;

import com.alibaba.fastjson.TypeReference;
import com.google.gson.reflect.TypeToken;
import com.strong.fee.util.entity.Student;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author: 小殊
 * create: 2018/7/28 下午5:17
 */
public class FastJsonUtilTest {

    private Logger logger = LoggerFactory.getLogger(FastJsonUtilTest.class);

    @Test
    public void testFastJsonUtil001() {
        Student student = new Student();
        student.setId(1);
        student.setName("caofei");
        String json = FastJsonUtil.toJson(student);
        logger.info(json);
        Student student1 = FastJsonUtil.fromJson(json, Student.class);
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        json = FastJsonUtil.toJson(students);
        logger.info(json);

        List<Student> students1 = FastJsonUtil.fromJson(json, new TypeReference<List<Student>>() {

        });
        json = FastJsonUtil.toJson(students1);
        logger.info(json);
    }
}
