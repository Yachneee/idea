package com.kfm.boot1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
    private int id;
    private String name;
    private Date birth;
    private String gender;
}
