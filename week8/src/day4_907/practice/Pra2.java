package day4_907.practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author Administrator
 */
public class Pra2 {
    public static void main(String[] args) throws ParseException {
        HashSet<Date> hs=new HashSet<>();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        hs.add(sdf.parse("2023-9-6"));
        hs.add(sdf.parse("2023-8-18"));
        hs.add(sdf.parse("2023-7-30"));
        hs.add(sdf.parse("2023-7-17"));
        System.out.println("===增强for/迭代器遍历hs，找最早最晚===");
        Iterator<Date> it = hs.iterator();
        Date first=it.next();
        Date last=first;
//        for (Date d : hs) {
//            if(d.compareTo(first)<0){
//                first=d;
//            }else if(d.compareTo(last)>0){
//                last=d;
//            }
//        }
        while(it.hasNext()){
            Date date = it.next();
            if(date.compareTo(first)<0){
                first=date;
            }
            if(date.compareTo(last)>0){
                last=date;
            }
        }
        System.out.println(sdf.format(first));
        System.out.println(sdf.format(last));
        System.out.println("====TreeSet====");
        TreeSet ts=new TreeSet(hs);
        System.out.println("最早日期：" + sdf.format(ts.first()));
        System.out.println("最晚日期："+sdf.format(ts.last()));
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
