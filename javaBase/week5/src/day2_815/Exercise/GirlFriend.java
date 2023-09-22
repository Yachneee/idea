package day2_815.Exercise;

public class GirlFriend {
    String name;
    double height;
    double weight;
    public void wash(){
        System.out.println("女朋友帮我洗衣服\n");
    }
    public void cook(){
        System.out.println("女朋友给我做饭\n");
    }
    public void show(){
        System.out.println("我女朋友叫"+name+",身高"+height+"厘米,体重"+weight+"斤\n");
    }
    public GirlFriend(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
}
class GirlFriendTest{
    public static void main(String[] args) {
        GirlFriend gf=new GirlFriend("凤姐",155,130);
        gf.show();
        gf.wash();
        gf.cook();
    }
}
