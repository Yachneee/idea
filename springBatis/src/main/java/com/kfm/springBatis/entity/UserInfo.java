package com.kfm.springBatis.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import com.kfm.springBatis.utils.FormatUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TableName  user_info
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Alias("userInfo")
public class UserInfo implements Serializable {
    private String id;
    private String username;
    /**
     * 加密后的密码
     */
    private String password;
    private String name;

    public String getBirthday() {
        return FormatUtils.formatDate(birthday);
    }

    public String getCreateDate() {
        return FormatUtils.formatDateTime(createDate);
    }

    public String getUpdateDate() {
        return FormatUtils.formatDateTime(updateDate);
    }

    private String gender;
    private Date birthday;
    private String phone;
    private String email;
    private String qq;
    private String img;
    private Date createDate;
    private Date updateDate;
    private Integer state;
    private Boolean isDel;
    @Serial
    private static final long serialVersionUID = 1L;
}