/**
 * 时间：2019/6/7 15:27
 */
package com.demo.entity.student;

/**
 * @Classname Student
 * @Description TODO
 * @Date 2019/6/7 15:27
 * @Created by 陈舰
 */
public class Student {
    private Integer sid;
    private String sname;
    private Integer sage;
    private String address;
    private Integer gender;

    public Student(Integer sid, String sname, Integer sage, String address, Integer gender) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.address = address;
        this.gender = gender;
    }

    public Student() {

    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
