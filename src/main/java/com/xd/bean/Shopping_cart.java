package com.xd.bean;/*
@author hj
@create 2019-11-19-9:48
*/

import java.util.Date;

public class Shopping_cart {
    private Integer sid;        //购物车id
    private Integer userid;     //用户id
    private Integer course_id;  //课程id
    private Integer quantity;   //数量
    private Integer choose;     //是否选择，0为未选，1为已选
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间

    public Shopping_cart() {
    }

    public Shopping_cart(Integer sid, Integer userid, Integer course_id, Integer quantity, Integer choose, Date createTime, Date updateTime) {
        this.sid = sid;
        this.userid = userid;
        this.course_id = course_id;
        this.quantity = quantity;
        this.choose = choose;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getChoose() {
        return choose;
    }

    public void setChoose(Integer choose) {
        this.choose = choose;
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
        return "Shopping_cart{" +
                "sid=" + sid +
                ", userid=" + userid +
                ", course_id=" + course_id +
                ", quantity=" + quantity +
                ", choose=" + choose +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
