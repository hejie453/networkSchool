package com.xd.bean;/*
@author hj
@create 2019-11-19-9:53
*/

public class Uac {
    private Integer sacid;  //选课id
    private Integer userid; //用户id
    private Integer course_id;  //课程id

    public Uac() {
    }

    public Uac(Integer sacid, Integer userid, Integer course_id) {
        this.sacid = sacid;
        this.userid = userid;
        this.course_id = course_id;
    }

    public Integer getSacid() {
        return sacid;
    }

    public void setSacid(Integer sacid) {
        this.sacid = sacid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "Uac{" +
                "sacid=" + sacid +
                ", userid=" + userid +
                ", course_id=" + course_id +
                '}';
    }
}
