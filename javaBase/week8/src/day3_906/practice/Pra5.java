package day3_906.practice;

import java.util.ArrayList;

/**
 * @author Administrator
 */
public class Pra5 {
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        ArrayList a2=new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a2.add(2);
        a2.add(2);
        a2.add(4);
        System.out.println(a1+" - "+a2+" = "+toDifferSet(a1,a2));
        System.out.println(a1);
        System.out.println(a2);
    }
    public static ArrayList toDifferSet(ArrayList a1,ArrayList a2){
        ArrayList a= (ArrayList) a1.clone();
        a.removeAll(a2);
        return a;
    }
}
