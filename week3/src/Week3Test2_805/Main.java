package Week3Test2_805;

public class Main {
    public static void main(String[] args) {
        // 目标：掌握表达式的自动类型转换机制。
        byte a = 10;
        int b = 20;
        long c = 30;
        long rs = a + b + c;
        System.out.println(rs); // 60
        double rs2 = a + b + 1.0;
        System.out.println(rs2);  // 31.0
        byte i = 10;
        short j = 30;
        int rs3 = i + j;
        System.out.println(rs3);  // 40
        //
//        short s = 1;
//        s = s + 1; // short ==> int 去进行运算的 结果是 int 类型的
//        System.out.println(s); // 报错
//        // 分析下面的程序运行结果
//        byte b = 1;
//        short s = 2;
//        short x = b + s; // byte + short = int
//        System.out.println(x); // 报错
        short s = 1;
        s = 18 + 1;
        System.out.println(s); // 19
    }
}