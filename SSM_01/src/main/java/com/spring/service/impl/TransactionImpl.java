/**
 * 时间：2019/6/7 20:15
 */
package com.spring.service.impl;

import com.spring.entity.Student;
import com.spring.mapper.StudentMapper;
import com.spring.service.Transaction;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.awt.SunHints;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @Classname TransactionImpl
 * @Description TODO
 * @Date 2019/6/7 20:15
 * @Created by 陈舰
 */
@Service("TransactionImpl")
@Transactional
public class TransactionImpl implements Transaction {

    @Resource(name = "studentMapper")
    StudentMapper studentMapper;

    @Override
    public Student[] queryStudentArray() {
        Student[] students = new Student[10];
        Student student1 = studentMapper.queryStudentById(1);

        Student student2 = studentMapper.queryStudentById(2);
        students[0] = student1;
        students[1] = student2;
        return students;
    }


    @Override
    public void addStudenDemo() {
        Student stu = new Student();
        stu.setSage(20);
        stu.setSname("小张");
        stu.setAddress("北京朝阳区");
        stu.setGender(1);
        studentMapper.addStudent(stu);
        //模拟异常
        //int i = 100/0;
        Student stu1 = new Student();
        stu1.setSage(18);
        stu1.setSname("小晃");
        stu1.setAddress("杭州萧山");
        stu1.setGender(0);
        studentMapper.addStudent(stu1);
    }
}
