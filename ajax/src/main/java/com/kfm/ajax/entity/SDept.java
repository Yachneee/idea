package com.kfm.ajax.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * s_dept
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SDept implements Serializable {
    private Integer id;

    private String name;

    private Integer regionId;

    private static final long serialVersionUID = 1L;
}