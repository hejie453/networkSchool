package com.xd.bean;/*
@author hj
@create 2019-11-19-9:18
*/

import java.util.Date;

public class Pay {
    private Integer pay_id;             //支付id
    private Integer userid;             //用户id
    private String order_no;            //订单编号
    private String platform_number;     //支付宝支付流水号
    private Integer platStatus;          //支付宝支付状态
    private Date createTime;            //创建时间
    private Date updateTime;            //更新时间

    public Pay() {
    }

    public Pay(Integer pay_id, Integer userid, String order_no, String platform_number, Integer platStatus, Date createTime, Date updateTime) {
        this.pay_id = pay_id;
        this.userid = userid;
        this.order_no = order_no;
        this.platform_number = platform_number;
        this.platStatus = platStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getPay_id() {
        return pay_id;
    }

    public void setPay_id(Integer pay_id) {
        this.pay_id = pay_id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getPlatform_number() {
        return platform_number;
    }

    public void setPlatform_number(String platform_number) {
        this.platform_number = platform_number;
    }

    public Integer getPlatStatus() {
        return platStatus;
    }

    public void setPlatStatus(Integer platStatus) {
        this.platStatus = platStatus;
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
        return "Pay{" +
                "pay_id=" + pay_id +
                ", userid=" + userid +
                ", order_no='" + order_no + '\'' +
                ", platform_number='" + platform_number + '\'' +
                ", platStatus=" + platStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
