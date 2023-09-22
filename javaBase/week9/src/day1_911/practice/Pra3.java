package day1_911.practice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Administrator
 */
public class Pra3 {
    static class Employee implements Comparable<Employee>{
        private String name;
        private int age;
        private double salary;
        Employee(String name,int age,double salary){
            this.name=name;
            this.age=age;
            this.salary=salary;
        }
        @Override
        public int compareTo(Employee o) {
            return Double.compare(salary,o.salary);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Employee employee = (Employee) o;
            return age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, salary);
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "姓名：'" + name + '\'' +
                    ", 年龄：" + age +
                    ", 工资：" + salary +
                    '}';
        }
    }
    public static void main(String[] args) {
        Employee e1=new Employee("张三",20,5000);
        Employee e2=new Employee("李四",20,4000);
        Employee e3=new Employee("王五",22,4500);
        Employee e4=new Employee("孙六",24,6000);
        Employee e5=new Employee("钱七",21,5500);
        Set<Employee> set=new HashSet<>();
        Collections.addAll(set,e1,e2,e3,e4,e5);
        System.out.println("===========toList()+3.fori===========");
        List<Employee> employeeList = set.stream().sorted().toList();
        for (int i = 0; i < 3; i++) {
            System.out.println(employeeList.get(i));
        }
        System.out.println("========limit(maxSize)=======");
        set.stream().sorted().limit(3).forEach(o-> System.out.println(o));
    }
}
