package day3_816.exercise;

public class GeometryCalculator {
    double radius;
    double width;
    double height;
    double area;
    public double calculateCircleArea(double radius){
        this.radius=radius;
        this.area= Math.PI*Math.pow(radius,2);
        return area;
    }
    public double calculateRectangleArea(double width, double height){
        this.width=width;
        this.height=height;
        this.area= width * height;
        return area;
    }
}
