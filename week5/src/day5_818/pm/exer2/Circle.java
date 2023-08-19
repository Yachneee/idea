package day5_818.pm.exer2;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        super.calculateArea();
        System.out.println("圆的面积是："+(Math.PI*this.radius*this.radius));
    }
}
