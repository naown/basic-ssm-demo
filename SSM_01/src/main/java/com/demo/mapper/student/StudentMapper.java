/**
 * 时间：2019/6/7 15:32
 */
package com.demo.mapper.student;

import com.demo.entity.student.Student;

/**
 * @Classname StudentMapper
 * @Description TODO
 * @Date 2019/6/7 15:32
 * @Created by 陈舰
 */

public interface StudentMapper {

    Student queryStudentById(int sid);

    void addStudent(Student student);
}
