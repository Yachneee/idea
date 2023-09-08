package day4_907.practice;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Administrator
 */
public class Pra3 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("List");
        hs.add("ArrayList");
        hs.add("LinkedList");
        hs.add("Vector");
        hs.add("Stack");
        hs.add("Set");
        hs.add("HashSet");
        hs.add("TreeSet");
        System.out.println("====ArrayList====");
        ArrayList a=new ArrayList(hs);
//
        a.sort(new MyComparator());
        System.out.println(a);
        System.out.println("====TreeSet====");
//        TreeSet t=new TreeSet((o1,o2)->{
//            String str1=(String) o1;
//            String str2=(String) o2;
//            int result=str1.length()-str2.length();
//            if(result==0){
//                result=str1.compareTo(str2);
//            }
//            return result;
//        });
        TreeSet t=new TreeSet(new MyComparator());
        t.addAll(hs);
        System.out.println(t);
    }
    static class MyComparator implements Comparator{

        @Override
        public int compare(Object o1, Object o2) {
            String str1=(String) o1;
            String str2=(String) o2;
            int result=str1.length()-str2.length();
            if(result==0){
                result=str1.compareTo(str2);
            }
            return result;
        }
    }
}
