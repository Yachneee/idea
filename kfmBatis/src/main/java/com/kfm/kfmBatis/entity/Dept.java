package com.kfm.kfmBatis.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @TableName dept
 */
@Data
@Alias("dept")
public class Dept implements Serializable {
    private Integer deptNo;

    private String deName;

    private String loc;
    private List<Emp> empList;

    private static final long serialVersionUID = 1L;
}