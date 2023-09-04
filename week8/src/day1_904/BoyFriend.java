package day1_904;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author Administrator
 */

public enum BoyFriend {
    /**
     * kun
     */
    kun("蔡徐坤",25),pjz("朴炯植",32);
    private String name;
    private int age;
    BoyFriend(String name, int age){

        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BoyFriend{" +
                "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        BoyFriend bf=BoyFriend.kun;
        BoyFriend bf1=BoyFriend.valueOf("pjz");
        System.out.println(bf.getAge());
        System.out.println(bf1.ordinal());
        BoyFriend[] boyFriends = BoyFriend.values();
        System.out.println(Arrays.toString(boyFriends));
    }
}
