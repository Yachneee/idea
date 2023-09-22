package day4_817.extend;

public class Sup {
    int a = 1;
    static {
        b = 3;
    }

    static int b = 2;

    public Sup(int a, int b) {
        print();
        this.a = a;
        this.b = b;
    }
    public void print() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void printInfo(){
        System.out.println("father.static");
    }
}
