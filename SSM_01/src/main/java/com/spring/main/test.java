/**
 * 时间：2019/6/7 15:37
 */
package com.spring.main;


import com.spring.entity.Student;
import com.spring.mapper.StudentMapper;
import com.spring.service.Transaction;
import com.spring.service.impl.TransactionImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Classname test
 * @Description TODO
 * @Date 2019/6/7 15:37
 * @Created by 陈舰
 */
public class test {

    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.queryStudentById(1);
        System.out.println(student);

    }

    @Test
    public void Demo(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        StudentMapper mapper = (StudentMapper)ac.getBean("studentMapper");
        Student student = mapper.queryStudentById(1);
        System.out.println(student);
    }

    @Test
    public void Demo1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        TransactionImpl mapper = (TransactionImpl)ac.getBean("TransactionImpl");
        Student[] students = mapper.queryStudentArray();
        //System.out.println(students);
        for (Student s : students){
            System.out.println(s);
        }
    }

    @Test
    public void Demo2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
        Transaction mapper = (Transaction)ac.getBean("TransactionImpl");
        mapper.addStudenDemo();
    }
}
