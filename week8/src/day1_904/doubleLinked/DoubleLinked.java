package day1_904.doubleLinked;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Administrator
 */
public class DoubleLinked {
    static class Node{
        private Node prev;
        private Object value;
        private Node next;

        Node(Node prev, Object value ,Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "前一个元素：" + prev +
                    ", 元素值：" + value +
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
            return Objects.equals(prev, node.prev) && Objects.equals(value, node.value) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(prev, value, next);
        }
    }
    private Node first;
    private Node last;
    private int size;

    /**
     * 获取链表长度
     * @return 链表长度size
     */
    public int size(){return size;}

    /**
     * 判断链表是否为空
     * @return 如果size==0，链表为空，返回true
     */
    public boolean isEmpty(){return size==0;}

    /**
     * 获取指定索引出的节点
     * @param index 索引
     * @return 索引处的节点
     */
    public Node get(int index){
        if(isEmpty()||index<0||index>=size){
            return null;
        }
        Node node=first;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }

    /**
     * 查询指定元素在链表中的索引值
     * @param obj 指定元素
     * @return 如果链表中有该元素返回下标，否则返回-1
     */
    public int indexOf(Object obj){
        if(isEmpty()){
            return -1;
        }
        Node node=first;
        int index=0;
        while(!Objects.equals(node.value,obj)){
            if(node==last){
                return -1;
            }
            node=node.next;
            index++;
        }
        return index;
    }

    /**
     * 判断链表是否包含某个对象
     * @param obj 判断的对象
     * @return 包含返回true，不包含返回false
     */
    public Boolean contains(Object obj){
        if(isEmpty()){
            return false;
        }
        Node node=first;
        while(node!=null){
            if(node.value.equals(obj)){
                return true;
            }
            node=node.next;
        }
        return false;
    }

    /**
     * 添加元素到链表中
     * @param obj 添加的元素
     * @return true
     */
    public boolean add(Object obj){
        Node node= new Node(null, obj, null);
        if(first==null){
            first=node;
            last=first;
            size++;
            return true;
        }
        last.next=node;
        node.prev=last;
        last=node;
        size++;
        return true;
    }

    /**
     * 向指定索引处插入元素
     * @param index 索引
     * @param obj 插入的元素
     * @return 插入结果(index不合理时返回false)
     */
    public boolean insert(int index,Object obj){
        Node node=new Node(null,obj,null);
        if(index==0){
            first.prev=node;
            node.next=first;
            first=node;
            size++;
            return true;
        }
        Node now=get(index);
        if(now==null){
            return false;
        }
        Node prev=now.prev;
        now.prev=node;
        node.next=now;
        node.prev=prev;
        prev.next=node;
        size++;
        return true;
    }

    /**
     * 删除第一个元素
     * @return 删除结果
     */
    public boolean removeFirst(){
        if(first==null){
            return false;
        }
        if(size==1){
            first=null;
            size--;
            return true;
        }
        Node next=first.next;
        next.prev=null;
        first=next;
        size--;
        return true;
    }

    /**
     * 删除最后一个元素
     * @return 删除结果
     */
    public boolean removeLast(){
        if(last==null){
            return false;
        }
        if(size==1){
            first=null;
            size--;
            return true;
        }
        Node prev=last.prev;
        prev.next=null;
        last=prev;
        size--;
        return true;
    }

    /**
     * 删除某个元素
     * @param obj 删除的元素
     * @return 结果(没有找到，返回false)
     */
    public boolean remove(Object obj){
        if(size==0){
            return false;
        }
        if(Objects.equals(first.value,obj)){
            return removeFirst();
        }
        if(Objects.equals(last.value,obj)){
            return removeLast();
        }
        Node n=first.next;
        while(!Objects.equals(n.value,obj)){
            n=n.next;
            if(n==last){
                return false;
            }
        }
        Node prev=n.prev;
        Node next=n.next;
        prev.next=next;
        next.prev=prev;
        size--;
        return true;
    }

    /**
     * 将链表转换成字符串
     * @return DoubleLinked[元素，元素，...]
     */
    @Override
    public String toString() {
        if(size==0){
            return null;
        }
        StringBuilder str= new StringBuilder("DoubleLinked[");
        Node n=first;
        while(n.next!=null){
            str.append(n.value).append(",");
            n=n.next;
        }
        str.append(n.value).append("]");
        return str.toString();
    }
    public Object[] toObjectArray(){
        Object[] objects=new Object[size];
        Node node=first;
        for (int i = 0; i < size; i++) {
            objects[i]=node.value;
            node=node.next;
        }
        return objects;
    }
}
class Test{
    public static void main(String[] args) {
        DoubleLinked doubleLinked=new DoubleLinked();
        System.out.println(doubleLinked.size());
        doubleLinked.add(1);
        doubleLinked.add(2);
        doubleLinked.add(3);
        doubleLinked.add(4);
        System.out.println(doubleLinked);
        doubleLinked.removeFirst();
        System.out.println(doubleLinked);
        doubleLinked.removeLast();
        System.out.println(doubleLinked);
        doubleLinked.remove(2);
        System.out.println(doubleLinked);
        doubleLinked.insert(0,"first");
        doubleLinked.insert(1,"second");
        doubleLinked.add("last");
        System.out.println(doubleLinked.size());
        System.out.println(Arrays.toString(doubleLinked.toObjectArray()));
        System.out.println(doubleLinked.contains(3));
        System.out.println(doubleLinked);

    }
}
