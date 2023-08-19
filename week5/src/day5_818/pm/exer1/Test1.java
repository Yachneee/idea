package day5_818.pm.exer1;

import day5_818.pm.exer1.Car;
import day5_818.pm.exer1.Motorcycle;

public class Test1 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle("tsl",2023);
        vehicle.displayInfo();
        Car c=new Car("xqc",2023,6);
        c.displayInfo();
        Motorcycle m=new Motorcycle("mt",2023,false);
        m.displayInfo();
    }
}
