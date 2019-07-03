package com.ssm.main;

import com.ssm.entity.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.jta.SpringJtaSynchronizationAdapter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class demo {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentService studentService;

    @Test
    public void queryMapper(){
        Student student1 = studentMapper.queryStudent(1);
        System.out.println(student1);

    }

    @Test
    public void queryService(){
        Student student1 = studentService.queryOne(1);
        System.out.println(student1);
    }

    @Test
    public void insert(){
        Student student = new Student(200,"沉沉",20,"中国","男");
        studentService.insert(student);
    }
}
