package day5_908.pm.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author Administrator
 */
public class Pra3 {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1, "安琪拉");
        map.put(2, "妲己");
        map.put(3, "貂蝉");
        map.put(4, "大乔");
        //遍历集合，并将序号与对应人名打印
        map.forEach((key,value)-> System.out.println(key+"->"+value));
        //向该map集合中插入一个编码为5,姓名为小乔的信息
        //put()
        map.put(5, "小乔");
        //computeIfAbsent()
//        map.computeIfAbsent(5, new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return "小乔";
//            }
//        });
        //compute()+Lambda
//        map.compute(5,(value,value1)->"小乔");
        System.out.println(map.get(5));
        //移除该map中的编号为1的信息
        String removeValue = map.remove(1);
        System.out.println(removeValue);
        //将map集合中编号为2的姓名信息修改为孙策
//        System.out.println(map.compute(2, (value, value1) -> "孙策"));
        System.out.println(map.put(2, "孙策"));
        System.out.println(map);
    }
}
