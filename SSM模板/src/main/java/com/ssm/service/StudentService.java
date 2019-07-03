package com.ssm.service;

import com.ssm.entity.Student;

import java.util.List;

public interface StudentService {

    Student queryOne(int sid);

    void insert(Student student);

    List<Student> queryAll();
}
