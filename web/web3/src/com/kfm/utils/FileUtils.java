package com.kfm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
public class FileUtils {
    /**
     * 将单位为B的字节数转为KB
     * @param size B
     * @return 转换成KB单位
     */
    public static double getSize(long size) {
        // size -- B -- >KB
        return size * 1.0 / 1024;
    }

    /**
     * 将时间戳格式化成yyyy-MM-dd hh:mm:ss
     * @param time 时间戳
     * @return yyyy-MM-dd hh:MM:ss 的时间表达式
     */
    public static String getTime(long time) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
        return sdf.format(date);
    }
}
