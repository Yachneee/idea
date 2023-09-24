package day4_921.TCP_exercise.exe3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
    //消息格式(text, mp3,jpg, png,..
    //消息内容
    //发送时间
    //接收回复端口
    private String format;
    private String content;
    private String time;
    private int replyPort;
}
