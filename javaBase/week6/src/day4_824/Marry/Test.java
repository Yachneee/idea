package day4_824.Marry;

public class Test {
    public static void main(String[] args) {
        Cab c=new Cab();
        Person p1=new Person("陆长空",'男',25,false);
        Person p2=new Person("宋祥云",'女',22,false);
        System.out.printf("%s 和 %s %s可以结婚",p1.getName(),p2.getName(),(c.canMarry(p1,p2)?"":"不"));
    }
}
