package day3_906;

import java.util.LinkedList;

/**
 * @author Administrator
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList myLL=new LinkedList();
        myLL.add(1);
        myLL.add(3);
        myLL.add(1);
        myLL.add(1);
        myLL.add(3);
        myLL.add(1);
        System.out.println(judgeSymmetry(myLL));
        System.out.println(judgeSymmetry1(myLL));
    }
    public static boolean judgeSymmetry(LinkedList l){
        for (int i = 0; i < l.size()/2; i++) {
            if(!l.get(i).equals(l.get(l.size()-i-1))){
                return false;
            }
        }
        return true;
    }
    public static boolean judgeSymmetry1(LinkedList ll){
        LinkedList l=(LinkedList)ll.clone();
        while(true){
            if (!l.removeFirst().equals(l.removeLast())) {
                return false;
            }
            if(l.size() == 0 || l.size() == 1){
                return true;
            }
        }
    }
}
