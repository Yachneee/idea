package day3_906.practice;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Administrator
 */
public class Pra3 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(5);
        a.add(3);
        a.add(2);
        System.out.println(a+"中的所有(去重)元素为："+countDiff(a)+",个数为："+countDiff(a).size());
        System.out.println(a+"中的不重复的元素为："+countUnique(a)+",个数为："+countUnique(a).size());
    }
    public static ArrayList countDiff(ArrayList a){
        ArrayList al=new ArrayList();
        for (int i = 0; i < a.size(); i++) {
            if(a.indexOf(a.get(i))==i){
                al.add(a.get(i));
            }
        }
        return al;
    }
    public static ArrayList countUnique(ArrayList a){
        ArrayList al=new ArrayList();
        for (Object o : a) {
            if(a.indexOf(o)==a.lastIndexOf(o)){
                al.add(o);
            }
        }
        return al;
    }
}
