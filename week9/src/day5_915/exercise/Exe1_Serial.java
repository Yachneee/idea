package day5_915.exercise;

import java.io.*;

/**
 * @author Administrator
 */
public class Exe1_Serial {
    public static void main(String[] args) {
        File file = new File("text", "serial.txt");
        try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream in=new ObjectInputStream(new FileInputStream(file))){
            Person son=new Person("son","0002",null);
            Person father=new Person("father","0001",son);
            out.writeObject(father);
            Person dad = (Person)in.readObject();
            System.out.println(dad);
            System.out.println("father==dad?\t"+(father==dad));
            System.out.println("father.equals(dad)?\t"+(father.equals(dad)));
            System.out.println("father.son==dad.son?\t"+(father.getSon()==dad.getSon()));
            System.out.println("father.getSon().equals(dad.getSon())?\t"+(father.getSon().equals(dad.getSon())));
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());;
        }
    }
}
