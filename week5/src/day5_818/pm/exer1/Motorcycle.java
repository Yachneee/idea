package day5_818.pm.exer1;

public class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    public Motorcycle(String brand,int year,boolean hasSideCar){
        super(brand,year);
        this.hasSideCar=hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("是否有边车："+hasSideCar);
    }
}
