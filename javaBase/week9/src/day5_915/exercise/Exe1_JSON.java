package day5_915.exercise;

import com.alibaba.fastjson2.JSON;

/**
 * @author Administrator
 */
public class Exe1_JSON {
    public static void main(String[] args) {
        Person son=new Person("son","0002",null);
        Person father=new Person("father","0001",son);
        String jsonString = JSON.toJSONString(father);
        System.out.println(jsonString);
        Person dad = JSON.parseObject(jsonString, Person.class);
        System.out.println(dad);
        System.out.println(father==dad); //false
        System.out.println(father.equals(dad)); //true
    }
}
