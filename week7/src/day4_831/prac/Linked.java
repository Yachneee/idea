package day4_831.prac;
import java.util.Objects;

/**
 * @author Administrator
 */
public class Linked{
    static class Node {
        private Object value;
        private Node next;
        public Node(Object value,Node next){
            this.value=value;
            this.next=next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "元素值：" + value +
                    ", 下一个元素：" + next +
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
            Node node = (Node) o;
            return Objects.equals(value, node.value) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, next);
        }
    }
    private Node first;
    private int size;

    /**
     * 获取链表长度
     * @return 链表长度size
     */
    public int size(){
        return size;
    }

    /**
     * 判断链表是否为空
     * @return 如果size==0链表为空，返回true
     */
    public boolean isEmpty(){
        return size==0;
    }

    /**
     * 判断链表是否包含某个对象
     * @param o 判断的对象
     * @return 包含返回true，不包含返回false
     */
    public boolean contains(Object o){
        if(isEmpty()){
            return false;
        }
        Node t=first;
        while(t!=null){
            //传入的是Node  ||  传入的不是Node,比较值
            if(t.equals(o)||t.value.equals(o)){
                return true;
            }
            t=t.next;
        }
        return false;
    }

    /**
     * 添加元素到链表中
     * @param o 添加的元素
     * @return true
     */
    public boolean add(Object o){
        size++;
        Node node= new Node(o, null);
        if(first==null){
            first=node;
            return true;
        }
        Node t=first;
        while(t.next!=null){
            t=t.next;
        }
        t.next=node;
        return true;
    }

    /**
     * 删除某个元素
     * @param o 要删除的元素
     * @return 结果(没有找到返回false)
     */
    public boolean remove(Object o){
        if(isEmpty()){
            return false;
        }
        Node n=first.next;
        //传入的是Node  ||  传入的不是Node
        if(first.equals(o)||first.value.equals(o)){
            first=n;
            return true;
        }
        Node before=first;
        Node now = first.next;
        while(now!=null){
            Node after=now.next;
            //传入的是Node  ||  传入的不是Node
            if(now.equals(o)||now.value.equals(o)){
                now.next=null;
                before.next=after;
                return true;
            }
            before=now;
            now=after;
        }
        return false;
    }

    /**
     * 获取指定位置的元素
     * (first->0 依次下去,找到序号为index的)
     * @param index 指定的位置
     * @return 位置的元素
     */
    public Object get(int index){
        if(isEmpty()||index>=size){
            return null;
        }
        int i=0;
        Node n=first;
        while(n!=null){
            if(i==index){
                return n;
            }
            i++;
            n=n.next;
        }
        return null;
    }

    /**
     * 返回指定元素的下标
     * (first->0,依次+1,比较getValue是否等于o,直到最后一个值不为空的)
     * @param o 指定的元素
     * @return 如果有，返回o的序号，没有返回-1
     */
    public int indexOf(Object o){
        if(isEmpty()){
            return -1;
        }
        int index=0;
        Node n=first;
        while(n!=null){
            //传入的是Node  ||  传入的不是Node
            if(n.equals(o)||n.value.equals(o)){
                return index;
            }
            index++;
            n=n.next;
        }
        return -1;
    }

    /**
     * 将链表转换成字符串
     * @return Linked[元素,元素,...]
     */
    @Override
    public String toString() {
        if(size==0){
            return null;
        }
        String str="Linked[";
        Node n=first;
        while(n.next!=null){
            str+=n.value+",";
            n=n.next;
        }
        return str+n.value+"]";
    }
}
class Test{
    public static void main(String[] args) {
        Linked myLinked=new Linked();
        System.out.println(myLinked.size());
        System.out.println(myLinked.add(1));
        System.out.println(myLinked.add(2));
        System.out.println(myLinked.add(3));
        System.out.println(myLinked.add(4));
        System.out.println(myLinked.size());
        System.out.println(myLinked.get(0));
        System.out.println(myLinked.get(2));
        boolean b=true;
        System.out.println(myLinked.add(b));
        System.out.println(myLinked);
        Object n=myLinked.get(4);
        System.out.println(n);
        System.out.println(myLinked.remove(n));
        System.out.println(myLinked);
        System.out.println(myLinked.remove(1));
        System.out.println(myLinked);
    }
}
