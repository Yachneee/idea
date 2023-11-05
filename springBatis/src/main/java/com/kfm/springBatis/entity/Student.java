package com.kfm.springBatis.entity;

import com.kfm.springBatis.utils.FormatUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String name;

    public String writeName() {
        if(name!=null){
            setName(name.replace("%",""));
        }
        return name;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    public String getBirth() {
        if(birth!=null){
            return FormatUtils.formatDate(birth);
        }
        return null;
    }

    private String gender;
}
