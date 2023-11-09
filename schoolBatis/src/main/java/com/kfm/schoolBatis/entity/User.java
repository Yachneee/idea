package com.kfm.schoolBatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String sex;

    private String avatar;
    private List<Role> roles;
    private Timestamp lastLoginTime;

    private static final long serialVersionUID = 1L;
}