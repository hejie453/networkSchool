package com.xd.bean;/*
@author hj
@create 2019-11-19-9:38
*/

import java.util.Date;

public class Shipping {
    private Integer shipping_id;   //收货id
    private Integer userid;        //用户id
    private String name;            //收货人姓名
    private Integer tel;            //电话
    private String province;        //省份
    private String city;            //城市
    private String county;          //区县
    private String address;         //详细地址
    private Integer postCode;       //邮编
    private Date createTime;        //创建时间
    private Date updateTime;        //更新时间

    public Shipping() {
    }

    public Shipping(Integer shipping_id, Integer userid, String name, Integer tel, String province, String city, String county, String address, Integer postCode, Date createTime, Date updateTime) {
        this.shipping_id = shipping_id;
        this.userid = userid;
        this.name = name;
        this.tel = tel;
        this.province = province;
        this.city = city;
        this.county = county;
        this.address = address;
        this.postCode = postCode;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(Integer shipping_id) {
        this.shipping_id = shipping_id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
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
        return "Shipping{" +
                "shipping_id=" + shipping_id +
                ", userid=" + userid +
                ", name='" + name + '\'' +
                ", tel=" + tel +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", address='" + address + '\'' +
                ", postCode=" + postCode +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
