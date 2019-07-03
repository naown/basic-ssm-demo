package com.ssm.mapper;

import com.ssm.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentMapper {
    int insert(Student student);

    Student queryStudent(int sid);

    List<Student> queryAll();
}
