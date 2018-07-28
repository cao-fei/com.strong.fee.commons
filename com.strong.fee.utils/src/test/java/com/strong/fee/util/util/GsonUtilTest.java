package com.strong.fee.util.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.strong.fee.util.entity.Student;
import com.strong.fee.util.entity.Student2;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * author: 小殊
 * create: 2018/7/28 下午5:17
 */
public class GsonUtilTest {

    private Logger logger = LoggerFactory.getLogger(GsonUtilTest.class);

    @Test
    public void testGsonUtil001() {
        Student student = new Student();
        student.setId(1);
        student.setName("caofei");
        String json = GsonUtil.toJson(student);
        logger.info(json);
        Student student1 = GsonUtil.fromJson(json, Student.class);
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student1);

        json = GsonUtil.toJson(students);
        logger.info(json);

        List<Student> students1 = GsonUtil.fromJson(json, new TypeToken<List<Student>>() {

        });
        json = GsonUtil.toJson(students1);
        logger.info(json);
    }
}
