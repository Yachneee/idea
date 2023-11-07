package com.kfm.kfmBatis.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.apache.ibatis.type.Alias;

/**
 * @TableName emp
 */
@Data
@Alias("emp")
public class Emp implements Serializable {
    private Integer empNo;

    private String eName;

    private String job;

    private Integer mgr;

    private Date hirdate;

    private Double sal;

    private Double comm;

    private Integer deptNo;
    private Dept dept;

    private static final long serialVersionUID = 1L;
}