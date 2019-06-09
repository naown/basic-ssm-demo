/**
 * 时间：2019/6/7 23:18
 */
package com.demo.controller.student;


import com.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/6/7 23:18
 * @Created by 陈舰
 */
@Controller
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @GetMapping("user")
    @ResponseBody
    public String addUser(){
        studentService.addStudenDemo();
        return "200";
    }

    @GetMapping("user123")
    @ResponseBody
    public String addUser123(){
        studentService.addStudenDemo();
        return "200";
    }

}
