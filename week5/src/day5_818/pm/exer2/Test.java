package day5_818.pm.exer2;

public class Test {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.calculateArea();
        Shape jx=new Rectangle(10,12);
        jx.calculateArea();
        Shape y=new Circle(5);
        y.calculateArea();
    }
}
