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
        System.out.println(a+"中的不重复元素个数为："+countDiff(a));
    }
    public static int countDiff(ArrayList a){
        int count=0;
        for (int i = 0; i < a.size(); i++) {
            Object o = a.get(i);
            if(a.indexOf(o)==i){
                count++;
            }
        }
        return count;
    }
}
