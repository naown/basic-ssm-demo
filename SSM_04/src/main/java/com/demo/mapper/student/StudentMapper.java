/**
 * 时间：2019/6/7 15:32
 */
package com.demo.mapper.student;

import com.demo.entity.student.Prop;
import com.demo.entity.student.Student;
import com.demo.entity.student.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Classname StudentMapper
 * @Description TODO
 * @Date 2019/6/7 15:32
 * @Created by 陈舰
 */
@Repository
public interface StudentMapper {

    Student queryStudentById(int sid);

    void addStudent(Student student);

    void addUserStudent(Student student);

    User queryUser(String uname);

    List<Student> queryAll();

    void deleteById(int sid);

    void updateStudent(Student student);

    List<Student> queryLimit(Prop prop);

    int queryCount();
}
