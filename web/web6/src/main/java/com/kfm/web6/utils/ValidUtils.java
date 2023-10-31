package com.kfm.web6.utils;

/**
 * @author Administrator
 */
public class ValidUtils {
    /**
     * 校验邮箱是否合法
     *
     * @param email 输入的邮箱信息
     * @return 是否合法信息
     */
    public static boolean validEmail(String email) {
        String pattern = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        return email.matches(pattern);
    }

    /**
     * 校验密码强度 密码(以字母开头，长度在6~18之间，只能包含字母、数字和下划线)
     *
     * @param password 输入的密码信息
     * @return 是否强密码
     */
    public static boolean validPassword(String password) {
        String pattern = "^[a-zA-Z]\\w{5,17}$";
        return password.matches(pattern);
    }

    /**
     * 校验账号是否是否合法 账号是否合法(字母开头，允许5-16个字节，允许字母数字下划线)
     *
     * @param username 输入的用户名
     * @return 用户名是否合法
     */
    public static boolean validUsername(String username) {
        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,15}$";
        return username.matches(pattern);
    }
    /**
     * 校验手机号是否是否合法
     *
     * @param phone 输入的手机号码
     * @return 手机号码是否合法
     */
    public static boolean validPhone(String phone){
        String pattern="^(13[0-9]|14[01456879]|15[0-35-9]|16[2567]|17[0-8]|18[0-9]|19[0-35-9])\\d{8}$";
        return phone.matches(pattern);
    }
//    public static int
}
