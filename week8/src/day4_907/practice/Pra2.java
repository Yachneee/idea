package day4_907.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Administrator
 */
public class Pra2 {
    public static void main(String[] args) throws ParseException {
        HashSet hs=new HashSet();
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        hs.add(format.parse("2023-9-6"));
        hs.add(format.parse("2023-8-18"));
        hs.add(format.parse("2023-7-30"));
        hs.add(format.parse("2023-7-17"));
        System.out.println("====TreeSet====");
        TreeSet ts=new TreeSet(hs);
        ts.forEach(o-> System.out.println(format.format(o)));
        System.out.println("最早日期：" + format.format(ts.first()));
        System.out.println("最晚日期："+format.format(ts.last()));
        System.out.println("====LinkedList====");
        LinkedList ll=new LinkedList<>(hs);
        ll.sort(null);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println("====ArrayList====");
        ArrayList al=new ArrayList<>(hs);
//        al.sort(null);
        Collections.sort(al);
        System.out.println(al.get(0));
        System.out.println(al.get(al.size()-1));
    }
}
