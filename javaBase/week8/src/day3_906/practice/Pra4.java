package day3_906.practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Administrator
 */
public class Pra4 {
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
        System.out.println(a1+"和"+a2+"的交集为"+toIntersection(a1,a2));
        System.out.println(a1+"和"+a2+"的交集为"+toIntersection1(a1,a2));
    }
    public static ArrayList toIntersection(ArrayList a1,ArrayList a2){
        ArrayList a=new ArrayList();
        for (int i = 0; i < a1.size(); i++) {
            Object o = a1.get(i);
            if(a2.contains(o)&&countElement(a,o)<countElement(a2,o)){
                a.add(o);
            }
        }
        return a;
    }

    /**
     * 数集合中元素的个数
     * @param a 集合
     * @param o 元素
     * @return 个数
     */
    private static int countElement(ArrayList a,Object o){
        int count=0;
        Iterator it=a.iterator();
        while(it.hasNext()){
            if(it.next().equals(o)){
                count++;
            }
        }
        return count;
    }
    public static ArrayList toIntersection1(ArrayList a1,ArrayList a2){
        ArrayList a= (ArrayList) a1.clone();
        a.retainAll(a2);
        return a;
    }
}
