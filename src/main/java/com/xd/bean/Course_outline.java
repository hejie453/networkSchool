package com.xd.bean;/*
@author hj
@create 2019-11-19-8:59
*/

public class Course_outline {
    private Integer course_outline_id;      //课程大纲id
    private String course_url;              //课程视频url
    private String course_content;          //课程内容
    private String course_startTime;        //开课时间
    private Integer course_id;              //课程id

    public Course_outline() {
    }

    public Course_outline(Integer course_outline_id, String course_url, String course_content, String course_startTime, Integer course_id) {
        this.course_outline_id = course_outline_id;
        this.course_url = course_url;
        this.course_content = course_content;
        this.course_startTime = course_startTime;
        this.course_id = course_id;
    }

    public Integer getCourse_outline_id() {
        return course_outline_id;
    }

    public void setCourse_outline_id(Integer course_outline_id) {
        this.course_outline_id = course_outline_id;
    }

    public String getCourse_url() {
        return course_url;
    }

    public void setCourse_url(String course_url) {
        this.course_url = course_url;
    }

    public String getCourse_content() {
        return course_content;
    }

    public void setCourse_content(String course_content) {
        this.course_content = course_content;
    }

    public String getCourse_startTime() {
        return course_startTime;
    }

    public void setCourse_startTime(String course_startTime) {
        this.course_startTime = course_startTime;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "Course_outline{" +
                "course_outline_id=" + course_outline_id +
                ", course_url='" + course_url + '\'' +
                ", course_content='" + course_content + '\'' +
                ", course_startTime='" + course_startTime + '\'' +
                ", course_id=" + course_id +
                '}';
    }
}
