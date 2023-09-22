package day4_907;

import java.util.*;

/**
 * @author Administrator
 */
public class TreeSetTest {
    static class Student implements Comparable{
        private String name;
        private int age;
        Student(String name,int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "姓名：'" + name + '\'' +
                    ", 年龄：" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Student student = (Student) o;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public int compareTo(Object o) {
            if(this.equals(o)){
                return 0;
            }
            if(o instanceof Student s){
                int r1=this.age-s.age;
                int r2=this.name.compareTo(s.name);
                return r1!=0?r1:r2;
            }
            throw new ClassCastException("不是Student!");
        }
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(new Student("张三",18));
        set.add(new Student("李四",15));
        set.add(new Student("王五",20));
        set.add(new Student("孙六",19));
        set.add(new Student("张四",18));
        set.add(new Student("李五",17));
        System.out.println("========增强for循环========");
        for (Object o : set) {
            System.out.println(o);
        }
        System.out.println("========forEach()========");
        set.forEach(o -> System.out.println(o));
        System.out.println("========iterator()========");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("======descendingIterator()======");
        Iterator it2 = set.descendingIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println("======tailSet(o,true)===NavigableSet===");
        Student s=new Student("张三",18);
//        System.out.println(set.add(s));
        NavigableSet set1 = set.tailSet(s, true);
        set1.forEach(o -> System.out.println(o));
        System.out.println("======tailSet(o,false)===NavigableSet===");
//        System.out.println(set.add(s));
        NavigableSet set2 = set.tailSet(s, false);
        set2.forEach(o -> System.out.println(o));
        System.out.println("======tailSet(o)===SortedSet===");
        SortedSet set3 = set.tailSet(s);
        set3.forEach(o -> System.out.println(o));
        System.out.println("======ceiling(o)===Object===");
        System.out.println(set.ceiling(s));
        System.out.println("======ceiling(o)===Object===");
        System.out.println(set.higher(s));
    }
}
