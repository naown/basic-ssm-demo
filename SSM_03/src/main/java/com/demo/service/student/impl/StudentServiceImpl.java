/**
 * 时间：2019/6/7 20:15
 */
package com.demo.service.student.impl;


import com.demo.entity.student.Student;
import com.demo.entity.student.User;
import com.demo.mapper.student.StudentMapper;
import com.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname TransactionImpl
 * @Description TODO
 * @Date 2019/6/7 20:15
 * @Created by 陈舰
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentMapper studentMapper;

    @Override
    public Student queryStudentById(int sid) {
        Student student = studentMapper.queryStudentById(sid);
        return student;
    }


    @Override
    public void addStudenDemo() {
        Student stu = new Student();
        stu.setSage(20);
        stu.setSname("小张123");
        stu.setAddress("北京朝阳区123");
        stu.setGender("女");
        studentMapper.addStudent(stu);
        //模拟异常
        //int i = 100/0;
        Student stu1 = new Student();
        stu1.setSage(18);
        stu1.setSname("小晃123");
        stu1.setAddress("杭州萧山123");
        stu1.setGender("男");
        studentMapper.addStudent(stu1);
    }

    @Override
    public void addStudentUser(Student student) {
        studentMapper.addUserStudent(student);
    }

    @Override
    public User queryUserimpl(String uname) {
        User user = studentMapper.queryUser(uname);
        return user;
    }

    @Override
    public List<Student> queryAllImpl(){
        List<Student> list = new ArrayList<>();
        list = studentMapper.queryAll();
        return list;
    }

    @Override
    public void deleteByIdImpl(int sid){
        studentMapper.deleteById(sid);
    }

    @Override
    public void updateStudentImpl(Student student){
        studentMapper.updateStudent(student);
    }
}
