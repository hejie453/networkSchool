package com.xd.bean;/*
@author hj
@create 2019-11-19-8:49
*/

import java.util.Date;

public class Course {
    private Integer course_id;      //课程id
    private String type;            //科目
    private String name;            //课程名
    private String image;           //课程图片
    private String message;         //课程信息
    private Integer course_outline_id;  //课程大纲id
    private Integer length;         //课程时长
    private Double price;           //课程价格
    private Integer number;         //课程名额
    private Integer teacher_id;     //教师id
    private Integer difficult;      //难度 1-5，单位星
    private Date createTime;        //创建时间
    private Date updateTime;        //更新时间

    public Course() {
    }

    public Course(Integer course_id, String type, String name, String image, String message, Integer course_outline_id, Integer length, Double price, Integer number, Integer teacher_id, Integer difficult, Date createTime, Date updateTime) {
        this.course_id = course_id;
        this.type = type;
        this.name = name;
        this.image = image;
        this.message = message;
        this.course_outline_id = course_outline_id;
        this.length = length;
        this.price = price;
        this.number = number;
        this.teacher_id = teacher_id;
        this.difficult = difficult;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCourse_outline_id() {
        return course_outline_id;
    }

    public void setCourse_outline_id(Integer course_outline_id) {
        this.course_outline_id = course_outline_id;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", message='" + message + '\'' +
                ", course_outline_id=" + course_outline_id +
                ", length=" + length +
                ", price=" + price +
                ", number=" + number +
                ", teacher_id=" + teacher_id +
                ", difficult=" + difficult +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
