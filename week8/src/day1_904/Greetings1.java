package day1_904;

import java.time.LocalTime;

/**
 * @author Administrator
 */

public enum Greetings1 {
    /**
     * 问候语
     */
    greet;
    private String text;
    private int hour;
    Greetings1() {
        hour=LocalTime.now().getHour();
    }

    public String getText() {
        if(hour>6&&hour<=8){
            text="早上好";
        } else if (hour>8&&hour<=11) {
            text="中午好";
        }else if (hour>11&&hour<=18) {
            text="下午好";
        }else if (hour>18) {
            text="晚上好";
        }else{
            text="凌晨好";
        }
        return text;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
}
class Test2{
    public static void main(String[] args) {
        Greetings1 greetings1 = Greetings1.greet;
        System.out.println(greetings1.getText());
        greetings1.setHour(19);
        System.out.println(greetings1.getText());
    }
}
