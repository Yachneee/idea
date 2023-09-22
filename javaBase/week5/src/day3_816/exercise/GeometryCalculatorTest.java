package day3_816.exercise;

public class GeometryCalculatorTest {
    public static void main(String[] args) {
        GeometryCalculator circle1=new GeometryCalculator();
        GeometryCalculator rectangle1=new GeometryCalculator();
        double s1=circle1.calculateCircleArea(2);
        System.out.println("半径为 "+circle1.radius+"的圆的面积为："+s1);
        double s2=rectangle1.calculateRectangleArea(40,50);
        System.out.println("长为 "+rectangle1.width+"，宽为："+rectangle1.height+"的矩形的面积为："+s2);
    }

}
