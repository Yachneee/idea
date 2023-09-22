package day5_901.danlianbiao;
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
            if(t.value.equals(o)){
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
     * 删除某个元素，找前一个元素
     * @param o 要删除的元素
     * @return 结果(没有找到返回false)
     */
    public boolean remove(Object o){
        if(isEmpty()){
            return false;
        }
        //传入的是Node  ||  传入的不是Node
        if(first.value.equals(o)){
            first=first.next;
            size--;
            return true;
        }
        Node n=first;
            //传入的是Node  ||  传入的不是Node
        while(!Objects.equals(n.next.value,o)){
            n=n.next;
            //当前的元素，且值不等于o
            if(n.next==null){
                //找到最后一个 (如果当前的元素(n)   n.next==null,说明n是最后一个且 它的值不等于o,说明找不到)
                return false;
            }
        }
        //n是前面的元素，要删除的元素是n.next(node)
        Node node=n.next;
        n.next=node.next;
        size--;
        return true;
    }

    /**
     * 删除元素，找到当前元素，保存前一个元素
     * @param obj 要删除的元素
     * @return 删除结果，如果没找到返回false
     */
    public boolean delete(Object obj){
        if(isEmpty()){
            return false;
        }
        Node t=first;
        Node prev=null;
        while(!Objects.equals(t.value,obj)){
            prev=t;
            t=t.next;
            if(t==null){
                return false;
            }
        }
        size--;
        if(prev==null){
            first=first.next;
            return true;
        }
        Node n=t.next;
        t.next=null;
        prev.next=n;
        return true;
    }
    public boolean insert(int index,Object obj){
        Node node=new Node(obj,null);
        if(index==0){
           node.next=first;
           first=node;
           size++;
           return true;
        }
        Object n=get(index);
        Object bef=get(index-1);
        if(bef instanceof Node before && n instanceof Node next){
            size++;
            before.next= new Node(obj,next);
            return true;
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
        if(isEmpty()||index<0||index>=size){
            return null;
        }
        Node n=first;
        for (int i = 0; i < index; i++) {
            n=n.next;
        }
        return n.value;
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
        Node n=first;
        int index=0;
        while (!n.value.equals(o)){
            if(n.next==null){
                return -1;
            }
            n=n.next;
            index++;
        }
        return index;
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
        StringBuilder str= new StringBuilder("Linked[");
        Node n=first;
        while(n.next!=null){
            str.append(n.value).append(",");
            n=n.next;
        }
        return str.toString() +n.value+"]";
    }
}
class Test{
    public static void main(String[] args) {
        Linked myLinked=new Linked();
        System.out.println(myLinked.size());
        System.out.println(myLinked);
        System.out.println("----下面添加元素----");
        System.out.println(myLinked.add(1));
        System.out.println(myLinked.add(2));
        System.out.println(myLinked.add(3));
        System.out.println(myLinked.add(4));
        System.out.println(myLinked.size());
        System.out.println("下标为0的元素为："+myLinked.get(0));
        System.out.println("下标为2的元素为："+myLinked.get(2));
        boolean b=true;
        System.out.println("----再添加一次----");
        System.out.println(myLinked.add(b));
        System.out.println("----indexof()----");
        int index=myLinked.indexOf(b);
        System.out.println(myLinked.indexOf(true));
        System.out.println(myLinked.indexOf(myLinked.get(index)));
        System.out.println("----get()----");
        Object n=myLinked.get(3);
        System.out.println(n);
        System.out.println("----删除----");
        System.out.println(myLinked.remove(n));
        System.out.println(myLinked);
        System.out.println(myLinked.remove(1));
        System.out.println(myLinked);
        System.out.println(myLinked.delete(1));
        System.out.println(myLinked.delete(2));
        System.out.println(myLinked);
        System.out.println(myLinked.size());
        System.out.println("----下面插入元素----");
        System.out.println(myLinked.insert(0,1));
        System.out.println(myLinked.insert(1,2));
        System.out.println(myLinked);
        System.out.println(myLinked.size());

    }
}
