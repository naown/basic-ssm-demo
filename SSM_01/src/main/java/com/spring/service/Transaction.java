package com.spring.service;

import com.spring.entity.Student;

/**
 * @Classname Transaction
 * @Description TODO
 * @Date 2019/6/7 20:12
 * @Created by 陈舰
 */
public interface Transaction {

    public Student[] queryStudentArray();

    public void addStudenDemo();
}
