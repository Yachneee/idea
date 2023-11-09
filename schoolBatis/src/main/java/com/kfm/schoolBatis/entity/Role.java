package com.kfm.schoolBatis.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 * @TableName role
 */
@Data
public class Role implements Serializable {
    private Integer rid;

    private String roleName;

    private String roleDesc;
    private List<User> users;

    private static final long serialVersionUID = 1L;
}