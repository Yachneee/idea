package com.kfm.kfmBatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName student
 */
@Data
public class Student implements Serializable {
    private Integer id;

    private String name;

    private String tel;

    private String loc;

    private static final long serialVersionUID = 1L;
}