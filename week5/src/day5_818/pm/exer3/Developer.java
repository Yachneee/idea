package day5_818.pm.exer3;

public class Developer extends Employee{
    private double hoursWorked;
    public Developer(String name,double salary,double hoursWorked){
        super(name,salary);
        this.hoursWorked=hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return super.calculateSalary()+40*hoursWorked;
    }
}
