/**
 * 时间：2019/6/7 23:18
 */
package com.demo.controller.student;


import com.demo.entity.student.Prop;
import com.demo.entity.student.Student;
import com.demo.entity.student.User;
import com.demo.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * @Classname StudentController
 * @Description TODO
 * @Date 2019/6/7 23:18
 * @Created by 陈舰
 */
/* 设为controller控制器，放入ioc容器中，然后将request中的key值为prop的
* 变量名的值存入session域中 */
@Controller
/*@SessionAttributes(types = Prop.class)*/
@SessionAttributes(value = "prop")
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    /*@Autowired
    StudentMapper studentMapper;*/
/* 测试类 没有意义 */
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }
/* 登陆逻辑，主要用于用户密码校验以及初始化获取数据库中的内容放入request域中以获取放入前端之中 */
    @RequestMapping("login")
    public String login(User user , Map<String,Object> map){
        User user1 = studentService.queryUserimpl(user.getUname());
        if (user1!=null){
            if (user1.getUname().equals(user.getUname())){
                if (user1.getUpassword().equals(user.getUpassword())){
                    int count = studentService.queryCountImpl();
                    Prop prop = new Prop(0,0,count,5);
                    List<Student> list = studentService.queryLimitImpl(prop);
                    map.put("students",list);
                    map.put("prop",prop);
                    return "succeed";
                }
            }
        }
        map.put("mess","用户名或密码错误");
        return "forward:index.jsp";
    }
/* 删除方法，获取学号以删除 */
    @RequestMapping("delete/{sid}")
    public String delete(@PathVariable("sid")int sid , HttpServletRequest request , Map<String,Object> map){
        studentService.deleteByIdImpl(sid);
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        List<Student> list = studentService.queryLimitImpl(prop);
        map.put("prop",prop);
        map.put("students",list);
        map.put("mess","删除成功");
        return "succeed";
        //return "redirect:views/succeed.jsp";
    }
/* 查询学生信息，以学号查询，然后将学生信息放入request域中，反回到前端以达到前端可以根据内容修改数据 */
    @RequestMapping("views/{id}")
    public ModelAndView updateStudent(@PathVariable("id")int sid){
        Student student = studentService.queryStudentById(sid);
        ModelAndView modelAndView = new ModelAndView("update");
        modelAndView.addObject("student1",student);
        System.out.println(student);
        return modelAndView;
    }
/* 更新学生信息，结合上面的查询方法以及前端修改方法，获得数据传入数据库以达到修改数据的目的 */
    @PostMapping("update")
    public ModelAndView update(Student student , HttpServletRequest request){
       // todo
        studentService.updateStudentImpl(student);
        ModelAndView modelAndView = new ModelAndView("succeed");
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        List<Student> list = studentService.queryLimitImpl(prop);
        modelAndView.addObject("students",list);
        modelAndView.addObject("prop",prop);
        return modelAndView;
    }
/* 测试，毫无意义 */
    @RequestMapping("111")
    public String test(){
        return "addStudent";
    }
/* 添加学生信息的方法，获取前端的数据，然后结合数据库添加 */
    @RequestMapping("addStudent1")
    public ModelAndView addStudent1(Student student , HttpServletRequest request){
        studentService.addStudentUser(student);
        System.out.println(student);
        ModelAndView modelAndView = new ModelAndView("succeed");
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        List<Student> list = studentService.queryLimitImpl(prop);
        modelAndView.addObject("students",list);
        modelAndView.addObject("prop",prop);
        modelAndView.addObject("mess","添加成功");
        return modelAndView;
    }
/* 更新前端数据表，目的就是更改显示条数的目的 */
    @RequestMapping("updateDATA")
    public String updateDATA(@PathParam("numbers")int numbers , Map<String,Object> map , HttpServletRequest request){
        System.out.println(numbers);
        Prop prop1 = (Prop)request.getSession().getAttribute("prop");
        Prop prop = new Prop(prop1.getHome(),prop1.getSpeed(),prop1.getCount(),numbers);
        List<Student> list = studentService.queryLimitImpl(prop);
        map.put("prop",prop);
        map.put("students",list);
        return "succeed";
    }
/* 分页的首页逻辑 */
    @RequestMapping("home")
    public String home(Map<String,Object> map , HttpServletRequest request){
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        prop.setSpeed(0);
        if (prop.getNumbers() == null){
            prop.setNumbers(5);
        }
        List<Student> list = studentService.queryLimitImpl(prop);
        map.put("students",list);
        map.put("prop",prop);
        return "succeed";
    }
/* 分页的尾页逻辑 */
    @RequestMapping("last")
    public String last(Map<String,Object> map , HttpServletRequest request){
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        prop.setSpeed((prop.getLast()-1)*prop.getNumbers());
        System.out.println((prop.getLast()-1)*prop.getNumbers()+"总数");
        System.out.println(prop.getLast()-1+"  last-1");
        System.out.println(prop.getNumbers()+"number");
        System.out.println(prop.getSpeed()+"speed");
        List<Student> list = studentService.queryLimitImpl(prop);
        map.put("students",list);
        map.put("prop",prop);
        return "succeed";
    }
/* 分页的下一页逻辑 */
    @RequestMapping("down")
    public String down(HttpServletRequest request , Map<String,Object> map){
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        prop.setSpeed(prop.getSpeed()+prop.getNumbers());
        List<Student> list = studentService.queryLimitImpl(prop);
        map.put("students",list);
        map.put("prop",prop);
        return "succeed";
    }
/* 分页的上一页逻辑 */
    @RequestMapping("previous")
    public String previous(HttpServletRequest request , Map<String,Object> map){
        Prop prop = (Prop)request.getSession().getAttribute("prop");
        prop.setSpeed(prop.getSpeed()-prop.getNumbers());
        List<Student> list = studentService.queryLimitImpl(prop);
        map.put("students",list);
        map.put("prop",prop);
        return "succeed";
    }
}
