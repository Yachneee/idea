package com.kfm.utils;

import java.util.Random;

/**
 * @author Administrator
 */
public class CaptchaUtils {
    private static final int SIX=6;
    private static Random R=new Random();
    public static String sixDigits(){
        StringBuilder captcha = new StringBuilder();
        for (int i = 0; i < SIX; i++) {
            captcha.append(R.nextInt(10));
        }
        return captcha.toString();
    }
}
