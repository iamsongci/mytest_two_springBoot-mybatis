package com.songci.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by SongLiuxin on 2018/2/8.
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private Integer roleId;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Student() {
    }

    public Student(String name, Integer roleId) {
        this.name = name;
        this.roleId = roleId;
    }

    public Student(Integer id, String name, Integer roleId) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
    }
}
