package com.kfm.schoolBatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginMessage {
    private String country;
    private String city;
    private String province;
    private Timestamp lastLoginTime;
}
