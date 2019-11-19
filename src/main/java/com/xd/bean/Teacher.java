package com.xd.bean;/*
@author hj
@create 2019-11-19-9:52
*/

public class Teacher {
    private Integer teacher_id;     //教师id
    private String image;           //头像
    private String name;            //姓名

    public Teacher() {
    }

    public Teacher(Integer teacher_id, String image, String name) {
        this.teacher_id = teacher_id;
        this.image = image;
        this.name = name;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_id=" + teacher_id +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
