package com.xd.bean;/*
@author hj
@create 2019-11-19-9:11
*/

import java.util.Date;

public class Order_item {
    private Integer item_id;            //子表id
    private Integer order_no;           //订单编号
    private Integer course_id;          //课程id
    private String course_name;         //课程名
    private String course_image;        //课程图片
    private Double current_unit_price;  //生成订单时的商品单价
    private Integer quantity;           //商品数量
    private Double total_price;         //商品总价
    private Date createTime;            //创建时间
    private Date updateTime;            //更新时间

    public Order_item() {
    }

    public Order_item(Integer item_id, Integer order_no, Integer course_id, String course_name, String course_image, Double current_unit_price, Integer quantity, Double total_price, Date createTime, Date updateTime) {
        this.item_id = item_id;
        this.order_no = order_no;
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_image = course_image;
        this.current_unit_price = current_unit_price;
        this.quantity = quantity;
        this.total_price = total_price;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getItem_id() {
        return item_id;
    }

    public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

    public Integer getOrder_no() {
        return order_no;
    }

    public void setOrder_no(Integer order_no) {
        this.order_no = order_no;
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_image() {
        return course_image;
    }

    public void setCourse_image(String course_image) {
        this.course_image = course_image;
    }

    public Double getCurrent_unit_price() {
        return current_unit_price;
    }

    public void setCurrent_unit_price(Double current_unit_price) {
        this.current_unit_price = current_unit_price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
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
        return "Order_item{" +
                "item_id=" + item_id +
                ", order_no=" + order_no +
                ", course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", course_image='" + course_image + '\'' +
                ", current_unit_price=" + current_unit_price +
                ", quantity=" + quantity +
                ", total_price=" + total_price +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
