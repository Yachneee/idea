package day5_1006;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String> map=Map.of(1,"a",2,"b",3,"3",4,"4");
        System.out.println("\33[35mmap.mentrySet(),set.iterator()、hasNext()、next(),entry.getKey()、entry.getValue()\33[0m");
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
        System.out.println("\33[35mmap.keySet(),set.增强for,map.get(key)\33[0m");
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            System.out.println(i+"-->"+map.get(i));
        }
        System.out.println("\33[35mmap.keySet(),set.forEach(Consumer),map.get(key)\33[0m");
        set.forEach(i ->System.out.println(i+"-->"+map.get(i)));
        System.out.println("\33[35mmap.forEach(BiConsumer)\33[0m");
        map.forEach((k,v)-> System.out.println(k+"-->"+v));
    }
}
