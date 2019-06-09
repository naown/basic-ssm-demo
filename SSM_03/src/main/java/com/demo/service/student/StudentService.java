package com.demo.service.student;


import com.demo.entity.student.Student;
import org.springframework.stereotype.Repository;

/**
 * @Classname Transaction
 * @Description TODO
 * @Date 2019/6/7 20:12
 * @Created by 陈舰
 */
@Repository
public interface StudentService {

    public Student[] queryStudentArray();

    public void addStudenDemo();

    public void addStudentUser(Student student);
}
