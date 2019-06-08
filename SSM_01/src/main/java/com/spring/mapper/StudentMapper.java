/**
 * 时间：2019/6/7 15:32
 */
package com.spring.mapper;

import com.spring.entity.Student;
import org.springframework.stereotype.Repository;

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
}
