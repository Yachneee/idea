package day2_905.pm;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author Administrator
 */
public class VectorTraversal {
    public static void main(String[] args) {
        Vector vector=new Vector();
        vector.add(5);
        vector.add(7);
        vector.add(3);
        vector.add(2);
        vector.add(9);
        vector.add(new Constellation("天秤座",9));
        vector.add(new Constellation("狮子座",8));
        //forEach(Consumer)
        vector.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.print(o+" ");
            }
        });
        System.out.println();
        vector.sort(new MyComparator());
        //迭代器
        Iterator it=vector.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        Object obj=vector.lastElement();
        if(obj instanceof Constellation c){
            c.setMonth(7);
        }
        vector.sort(new MyComparator());
        Iterator it1=vector.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
    }
}
class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Constellation c1&&o2 instanceof Constellation c2){
            return c1.getMonth()-c2.getMonth();
        } else if (o1 instanceof Integer i&&o2 instanceof Integer j) {
            return (int)o1-(int)o2;
        }
        return 0;
    }

}
