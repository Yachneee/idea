package com.kfm.kfmBatis.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * @author Yachne
 * @TableName ability
 */
@Data
public class Ability implements Serializable {
    private Integer id;

    private String abilityName;

    private String abilityDesc;

    private static final long serialVersionUID = 1L;
}