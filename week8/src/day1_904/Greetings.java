package day1_904;

import java.time.LocalTime;
import java.util.Date;

/**
 * @author Administrator
 */

public enum Greetings {
    /**
     * 问候语
     */
    MORNING("早上好"),NOON("中午好"),AFTERNOON("下午好"),EVENING("晚上好"),DAWN("凌晨好");
    private String text;
    Greetings(String text){
        this.text=text;
    }
    public String getText() {
        return text;
    }
}
class Test1{
    public static void main(String[] args) {
//        LocalTime localTime=LocalTime.now();
        LocalTime localTime=LocalTime.of(19,30);
        Greetings greetings;
        if(localTime.getHour()>6&&localTime.getHour()<=8){
            greetings=Greetings.MORNING;
        } else if (localTime.getHour()>8&&localTime.getHour()<=11) {
            greetings=Greetings.NOON;
        } else if (localTime.getHour()>11&&localTime.getHour()<=18) {
            greetings=Greetings.AFTERNOON;
        }else if (localTime.getHour()>18) {
            greetings=Greetings.EVENING;
        }else{
            greetings=Greetings.DAWN;
        }
        System.out.println(greetings.getText());
    }
}
