package com.xd.bean;/*
@author hj
@create 2019-11-19-9:55
*/

import java.util.Date;

public class User {
    private Integer userid;         //用户id
    private String email;           //邮箱
    private String password;         //密码
    private Integer identification;    //身份
    private String question;        //密保问题
    private String answer;          //答案
    private Date createTime;        //创建时间
    private Date updateTime;        //更新时间

    public User() {
    }

    public User(Integer userid, String email, String password, Integer identification, String question, String answer, Date createTime, Date updateTime) {
        this.userid = userid;
        this.email = email;
        this.password = password;
        this.identification = identification;
        this.question = question;
        this.answer = answer;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdentification() {
        return identification;
    }

    public void setIdentification(Integer identification) {
        this.identification = identification;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
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
        return "User{" +
                "userid=" + userid +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", identification=" + identification +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
