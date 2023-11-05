package com.kfm.springBatis.utils;

import cn.hutool.crypto.SecureUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
public class FormatUtils {
    public static String formatDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }
    public static String formatDateTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
}
