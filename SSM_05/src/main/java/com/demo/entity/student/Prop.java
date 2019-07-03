package com.demo.entity.student;

public class Prop {
    //首页
    private Integer home;
    //尾页  相当于总页数
    private Integer last;
    //当前页
    private Integer speed;//
    //总数据条数
    private Integer count;//66
    //每页显示几条数据
    private Integer numbers;//5

    /*
    *
    * //total : 总数
//pageSize : 每页显示数
//totalPage : 共页数
* last = (count+number-1)/count
var totalPage = (total + pageSize - 1)/pageSize;
    * */

    public Prop() {

    }
//0,0,5
    public Prop(Integer home, Integer speed, Integer count, Integer numbers) {
        this.home = home;
        this.speed = speed;
        this.count = count;
        this.numbers = numbers;
        this.last = ( count + numbers - 1 ) / numbers;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getLast() {
        return last;
    }

    public void setLast(Integer last) {
        this.last = last;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Prop{" +
                "home=" + home +
                ", last=" + last +
                ", speed=" + speed +
                ", count=" + count +
                ", number=" + numbers +
                '}';
    }
}
