package com.xiaoran.mybatis.beans;

import com.baomidou.mybatisplus.annotation.*;

import java.util.stream.Stream;
@TableName("tbl_user")
public class User {
    @TableId(value = "id", type = IdType.AUTO)
    private  int id;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String name;
    @TableLogic
    private int logic_flag;

    public User(int id, String name, int logic_flag) {
        this.id = id;
        this.name = name;
        this.logic_flag = logic_flag;
    }

    public User() {
    }

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

    public int getLogic_flag() {
        return logic_flag;
    }

    public void setLogic_flag(int logic_flag) {
        this.logic_flag = logic_flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", logic_flag=" + logic_flag +
                '}';
    }
}
