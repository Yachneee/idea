package day5_818.pm.exer2;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public Rectangle(){}
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void calculateArea(){
        super.calculateArea();
        System.out.println("面积是："+(this.length*this.width));
    }
}
