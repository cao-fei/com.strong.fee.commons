package com.strong.fee.util.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * author: 小殊
 * create: 2018/7/23 上午11:14
 */
public class Student {

    private int id;
    @SerializedName("code")
    private String name;
//    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date birthday = new Date();

    private String remark;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}