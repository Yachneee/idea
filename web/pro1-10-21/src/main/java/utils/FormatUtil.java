package utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 */
public class FormatUtil {
    /**
     * 将时间戳格式化成yyyy-MM-dd HH:mm:ss
     * @param time 时间戳
     * @return yyyy-MM-dd hh:MM:ss 的时间表达式
     */
    public static String getTime(long time) {
        Date date = new Date(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    /**
     * 使用MD5加密
     * @param password 密码
     * @return 加密后的字符串
     */
    public static String encode(String password){
        try {
            // 获取MessageDigest实例并指定算法类型
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 将数据转换为字节数组并计算哈希值
            byte[] hashBytes = md.digest(password.getBytes());
            // 将哈希值转换为十六进制字符串
            StringBuilder sb = new StringBuilder();
            for (byte b : hashBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return password;
    }

    /**
     * 设置编码格式
     * @param req 请求
     * @param resp 响应
     * @throws UnsupportedEncodingException 。
     */
    public static void setCharset(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
    }
}
