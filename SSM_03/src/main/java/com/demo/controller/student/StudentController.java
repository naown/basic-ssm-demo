/**
 * 时间：2019/6/7 23:18
 */
package com.demo.controller.student;


import com.demo.entity.student.Student;
import com.demo.entity.student.User;
import com.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/6/7 23:18
 * @Created by 陈舰
 */
@Controller
//@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    /*@Autowired
    StudentMapper studentMapper;*/

    @GetMapping
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping("login")
    public String login(User user , Map<String,Object> map){
        User user1 = studentService.queryUserimpl(user.getUname());
        if (user1!=null){
            if (user1.getUname().equals(user.getUname())){
                if (user1.getUpassword().equals(user.getUpassword())){
                    List<Student> list = studentService.queryAllImpl();
                    map.put("students",list);
                    return "succeed";
                }
            }
        }
        map.put("mess","用户名或密码错误");
        return "forward:index.jsp";
    }

    @RequestMapping("delete/{sid}")
    public ModelAndView delete(@PathVariable("sid")int sid){
        studentService.deleteByIdImpl(sid);
        ModelAndView modelAndView = new ModelAndView("succeed");
        List<Student> list = studentService.queryAllImpl();
        modelAndView.addObject("students",list);
        return modelAndView;
        //return "redirect:views/succeed.jsp";
    }

    @RequestMapping("views/{id}")
    public ModelAndView updateStudent(@PathVariable("id")int sid){
        //System.out.println(sid);
        Student student = studentService.queryStudentById(sid);
        ModelAndView modelAndView = new ModelAndView("redirect:update.jsp");
        modelAndView.addObject("student1",student);
        return modelAndView;
    }

    @RequestMapping("updateUser")
    public String updateUser(){
        return "111";
    }


}
