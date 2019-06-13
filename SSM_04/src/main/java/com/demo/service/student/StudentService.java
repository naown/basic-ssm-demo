package com.demo.service.student;


import com.demo.entity.student.Prop;
import com.demo.entity.student.Student;
import com.demo.entity.student.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname Transaction
 * @Description TODO
 * @Date 2019/6/7 20:12
 * @Created by 陈舰
 */
@Repository
public interface StudentService {

    Student queryStudentById(int sid);

    void addStudenDemo();

    void addStudentUser(Student student);

    User queryUserimpl(String uname);

    List<Student> queryAllImpl();

    void deleteByIdImpl(int sid);

    void updateStudentImpl(Student student);

    List<Student> queryLimitImpl(Prop prop);

    int queryCountImpl();
}
