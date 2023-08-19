package day5_818.pm.exer3;

public class Test {
    public static void main(String[] args) {
        Employee em1=new Employee("Bob",2000);
        System.out.println(em1.calculateSalary());
        Employee em2=new Manager("Jenny",3000,1000);
        System.out.println(em2.calculateSalary());
        Employee em3=new Developer("LiMing",2500,3.5);
        System.out.println(em3.calculateSalary());
    }
}
