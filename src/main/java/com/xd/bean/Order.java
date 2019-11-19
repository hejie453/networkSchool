package com.xd.bean;/*
@author hj
@create 2019-11-19-9:03
*/

import java.util.Date;

public class Order {
    private Integer order_id;               //id
    private String order_no;                //订单编号
    private Integer userid;                 //用户id
    private Integer shipping_address_no;    //收获地址id
    private Double payment;                 //实际付款金额
    private Double postage;                 //运费
    private Integer status;                 //订单状态
    private Date payTime;                   //支付时间
    private Date postTime;                  //发货时间
    private Date finishTime;                //交易完成时间
    private Date closeTime;                 //交易关闭时间
    private Date createTime;                //创建时间
    private Date updateTime;                //更新时间

    public Order() {
    }

    public Order(Integer order_id, String order_no, Integer userid, Integer shipping_address_no, Double payment, Double postage, Integer status, Date payTime, Date postTime, Date finishTime, Date closeTime, Date createTime, Date updateTime) {
        this.order_id = order_id;
        this.order_no = order_no;
        this.userid = userid;
        this.shipping_address_no = shipping_address_no;
        this.payment = payment;
        this.postage = postage;
        this.status = status;
        this.payTime = payTime;
        this.postTime = postTime;
        this.finishTime = finishTime;
        this.closeTime = closeTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getShipping_address_no() {
        return shipping_address_no;
    }

    public void setShipping_address_no(Integer shipping_address_no) {
        this.shipping_address_no = shipping_address_no;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public Double getPostage() {
        return postage;
    }

    public void setPostage(Double postage) {
        this.postage = postage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
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
        return "Order{" +
                "order_id=" + order_id +
                ", order_no='" + order_no + '\'' +
                ", userid=" + userid +
                ", shipping_address_no=" + shipping_address_no +
                ", payment=" + payment +
                ", postage=" + postage +
                ", status=" + status +
                ", payTime=" + payTime +
                ", postTime=" + postTime +
                ", finishTime=" + finishTime +
                ", closeTime=" + closeTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
