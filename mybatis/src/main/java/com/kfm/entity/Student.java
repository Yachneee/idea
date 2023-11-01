package com.kfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private int id;
    private String name;
    private Date birth;
    private String gender;
}
