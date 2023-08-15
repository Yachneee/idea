package day2_815.pm;

public class BoyFriend {
    String name;
    String job;
    int age;
    int height;
    int weight;
    public void sing(){
        System.out.println(name+"唱歌");
    }
    public void dance(){
        System.out.println(name+"跳舞");
    }
    public void concert(){
        System.out.println(name+"开演唱会");
    }
    public void introduce(){
        System.out.println(name+"是"+job+",年龄"+age+"岁,身高"+height+"cm,体重"+weight+"kg。");
    }

    public static void main(String[] args) {
        BoyFriend bf=new BoyFriend();
        bf.name="蔡徐坤";
        bf.age=24;
        bf.job="歌手";
        bf.height=184;
        bf.weight=65;
        bf.sing();
        bf.dance();
        bf.concert();
        bf.introduce();
    }
}
