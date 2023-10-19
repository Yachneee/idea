package com.kfm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileT {
    private int id;
    private String ip;
    private String file_name;
    private String file_type;
    private String file_size;
    private String time;
    private String address;
}
