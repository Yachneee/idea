package day5_818.pm.exer1;

public class Vehicle {
    private String brand;
    private int year;
    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void displayInfo(){
        System.out.println("品牌:"+brand);
        System.out.println("年份:"+year);
    }
}
