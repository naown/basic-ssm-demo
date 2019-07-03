package com.ssm.service.impl;

import com.ssm.entity.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional(readOnly = true)
    public Student queryOne(int sid) {
        //@Transactional(readOnly = true)查询建议只读事务，性能更优
        Student student = studentMapper.queryStudent(sid);
        return student;
    }

    @Override
    public void insert(Student student) {
        studentMapper.insert(student);
        //模拟异常
        //int i = 1/0;
    }

    @Override
    public List queryAll() {
        List<Student> students = studentMapper.queryAll();
        return students;
    }
}
