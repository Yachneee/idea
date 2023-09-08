package day5_908.pm;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @author Administrator
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map=Map.of("hello",5,"hi",2);
        System.out.println("====entrySet()====");
        //entrySet() -->Set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
//            System.out.println(stringIntegerEntry.getKey()+"-->"+stringIntegerEntry.getValue());
            System.out.println(stringIntegerEntry);
        }
        //forEach()
        System.out.println("====forEach()====");
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+"-->"+value);
            }
        });
        //forEach() +Lambda
        System.out.println("====forEach()+Lambda====");
        map.forEach((key,value)-> System.out.println(key+"-->"+value));
        System.out.println("=====Map(toString)=====");
        System.out.println(map);
        System.out.println("=====entrySet().toString====");
        System.out.println(entrySet);
    }
}
