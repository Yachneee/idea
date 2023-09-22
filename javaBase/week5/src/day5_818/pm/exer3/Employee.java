package day5_818.pm.exer3;

public class Employee {
    private String name;
    private double salary;
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double calculateSalary(){
        return salary;
    }
}
