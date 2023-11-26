package com.kfm.kfmBatis.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @TableName user
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private Integer roleId;
    private List<Ability> abilities;

    private static final long serialVersionUID = 1L;
}