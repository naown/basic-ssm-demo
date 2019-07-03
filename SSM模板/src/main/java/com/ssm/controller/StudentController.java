package com.ssm.controller;

import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import com.ssm.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/query")
    public String query(Map<String,Object> map){
        Student student = studentService.queryOne(1);
        System.out.println(student);
        map.put("student",student);
        return "query";
    }

    @RequestMapping("/queryStudentAll")
    public String queryAll(Map<String,Object> map){
        List<Student> students = studentService.queryAll();
        map.put("students",students);
        return "queryAll";
    }
}
