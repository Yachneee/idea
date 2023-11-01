package com.kfm.boot.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Administrator
 */
public class FormatUtil {
    /**
     * 将时间字符串转化为yyyy-MM-dd格式
     * @param time 要转化的时间字符串
     * @return 对应格式化后的字符串
     */
    public static String timeFormat(String time){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(time);
    }

    /**
     * 将字符串转化为sql.Date日期
     * @param time 要转化的字符串
     * @return 对应的Date
     * @throws ParseException ParseException
     */
    public static Date toSqlDate(String time) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = format.parse(time);
        Calendar cal = Calendar.getInstance();
        cal.setTime(utilDate);
        return new Date(cal.getTimeInMillis());
    }
}
