package day4_817.extend;

public class Sub extends Sup {
    int a = 11;
    int b = 22;

    public Sub(int a, int b) {
        super(a, b);
        print();
    }

    @Override
    public void print() {
        System.out.println(a);
        System.out.println(b);
    }
    public void info(){
        super.print();
        print();
        printInfo();
        Sup.printInfo();
    }
}
