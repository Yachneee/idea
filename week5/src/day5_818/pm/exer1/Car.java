package day5_818.pm.exer1;

public class Car extends Vehicle {
    private int numDoors;
    public Car(String brand,int year,int numDoors){
        super(brand,year);
        this.numDoors=numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("车门数量:"+numDoors);
    }
}
