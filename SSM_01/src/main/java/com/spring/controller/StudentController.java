/**
 * 时间：2019/6/7 23:18
 */
package com.spring.controller;

import com.spring.entity.Student;
import com.spring.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/6/7 23:18
 * @Created by 陈舰
 */
@Controller
@RequestMapping("resource")
public class StudentController {

//    @Resource(type = StudentMapper.class)
    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("testDemo")
    public String testDemo(){
        return "input";
    }

    @RequestMapping("addStudent")
    public String addStudent(Student student){
        System.out.println(student);
        studentMapper.addStudent(student);
        return "succeed";
    }
}
