package day3_906;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Administrator
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("田曦薇");
        al.add("李一桐");
        al.add("赵丽颖");
        al.add("杨幂");
        al.add("杨幂");
        al.add("金晨");
        al.add("金晨");
        al.forEach(obj-> System.out.print(obj+"  "));
        System.out.println();
        //迭代器删除元素，使用迭代器的remove方法删除，
        // expectedModCount=5(进入方法前的操作次数，之后不会变)
        // 进入方法后不能进行集合的增删操作，modCount++，next()方法中会检查modCount!=expectedModCount，true->会抛出异常
        Iterator it=al.iterator();
        while(it.hasNext()){
            if(it.next().equals("金晨")){
                it.remove();
            }
        }
        al.forEach(obj-> System.out.print(obj+"  "));
        System.out.println();
        //普通for，使用集合的remove()方法删除，注意删除后要i--
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i).equals("杨幂")){
                al.remove(i);
                i--;
            }
        }
        al.forEach(obj-> System.out.print(obj+"  "));
        System.out.println();
        //forEach()和增强for循环都不能操作集合元素
    }
}
