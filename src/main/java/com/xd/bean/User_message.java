package com.xd.bean;/*
@author hj
@create 2019-11-19-9:59
*/

import java.util.Date;

public class User_message {
    private Integer messageid;      //个人信息id
    private Integer userid;     //用户id
    private String image;       //用户头像
    private String name;        //昵称
    private String sex;     //性别
    private Integer age;        //年龄
    private Date birthday;      //出生日期
    private String address;     //所在地
    private String school;      //学校
    private Date createTime;        //创建时间
    private Date updateTime;        //更新时间

    public User_message() {
    }

    public User_message(Integer messageid, Integer userid, String image, String name, String sex, Integer age, Date birthday, String address, String school, Date createTime, Date updateTime) {
        this.messageid = messageid;
        this.userid = userid;
        this.image = image;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
        this.school = school;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getMessageid() {
        return messageid;
    }

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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
        return "User_message{" +
                "messageid=" + messageid +
                ", userid=" + userid +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
