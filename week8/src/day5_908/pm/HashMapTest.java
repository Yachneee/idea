package day5_908.pm;

import day5_908.am.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Administrator
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Student,Integer> hashMap=new HashMap<>();
        System.out.println(hashMap.put(new Student("张三", 18), 1));
        System.out.println(hashMap.put(new Student("张三", 18), 2));
        System.out.println("==forEach()==");
        hashMap.forEach(((student, num) -> System.out.println(num+": "+student)));
        System.out.println("==entrySet()==");
        Set<Map.Entry<Student, Integer>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Student, Integer>> it = entrySet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("==keySet()+get(key)==");
        Set<Student> students = hashMap.keySet();
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()){
            Student value = studentIterator.next();
            Integer num = hashMap.get(value);
            System.out.println(value+"->"+num);
        }
    }
}
