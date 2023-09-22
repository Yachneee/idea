package day2_905.pract;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author Administrator
 */
public class Pra1 {
    static Vector studentsName=new Vector();
    public static void main(String[] args) {
        addName("田曦薇");
        addName("李一桐");
        addName("金晨");
        printAllName();
        removeName("金晨");
        printAllName();
    }
    public static boolean addName(String name){
        return studentsName.add(name);
    }
    public static boolean removeName(String name){
        return studentsName.remove(name);
    }
    public static void printAllName(){
        Iterator it=studentsName.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+"  ");
        }
        System.out.println();
    }
}

