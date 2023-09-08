package day5_908.pm.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Administrator
 */
public class Pra1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>(Map.of(1,"安琪拉",2,
                "妲己",3,"貂蝉",4,"大乔"));
        System.out.println("====keySet()+Set迭代+get(key)====");
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            Integer key = keyIterator.next();
            String value = hashMap.get(key);
            System.out.println(key+"->"+value);
        }
        System.out.println("====entrySet()====");
        System.out.println("entrySet()+Set的增强for+Entry的getKey()和getValue()");
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"->"+value);
//            System.out.println(entry);
        }
        System.out.println("entrySet()+Set的forEach(Consumer)+Entry的getKey()和getValue()");
        entrySet.forEach(entry -> System.out.println(entry.getKey()+"->"+entry.getValue()));
        System.out.println("entrySet()+Set的迭代+Entry的getKey()和getValue()");
        Iterator<Map.Entry<Integer, String>> entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer, String> entry = entryIterator.next();
//            System.out.println(entry);
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
//        System.out.println(entrySet);
        System.out.println("====forEach(BiConsumer)+Lambda====");
        hashMap.forEach((key,value)-> System.out.println(key+"->"+value));
    }
}
