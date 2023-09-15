package day5_915.exercise;

/**
 * @author Administrator
 */
public class Exe1_Cloneable {
    public static void main(String[] args) {
        Person son=new Person("son","0002",null);
        Person father=new Person("father","0001",son);
        try {
            Person dad = (Person)father.clone();
            System.out.println(dad);
            System.out.println("father==dad? "+(father==dad));
            System.out.println("father.equals(dad)? "+father.equals(dad));
            System.out.println("father.getSon()==dad.getSon()? "+(father.getSon()==dad.getSon()));
            System.out.println("father.getSon().equals(dad.getSon())? "+(father.getSon().equals(dad.getSon())));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
