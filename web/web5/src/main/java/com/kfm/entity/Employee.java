package com.kfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {
    private int id;
    private String lastName;
    private String firstName;
    private String userid;
    private Timestamp startDate;
    private String comments;
    private int managerId;
    private String title;
    private int deptId;
    private Double salary;
    private Double commissionPct;
}
