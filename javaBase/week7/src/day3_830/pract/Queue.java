package day3_830.pract;

import java.util.Arrays;

/**
 * @author Administrator
 */
public abstract class Queue{
    /**
     * 将元素插入队尾
     * @param element 要插入的元素
     */
    abstract void enqueue(Object element);
    /**
     * 移除并返回队首元素
     * 删除第一个元素，并返回
     * @return 队首元素, 如果队列为空时，返回 null
     */
    abstract Object dequeue();
    /**
     * 返回队首元素，但不移除
     * @return 队首元素
     */
    abstract Object peek();
    /**
     * 检查队列是否为空
     * @return 如果队列为空则返回true，否则返回false
     */
    abstract boolean isEmpty();

    /**
     * 返回队列中的元素个数
     * @return 队列中的元素个数
     */
    abstract int size();
}
class MyQueue extends Queue{
    private Object[] objs;
    private int size=10;
    private int count=0;
    MyQueue(){
        this(10);
    }
    MyQueue(int size){
        if(size>this.size){
            this.size=size;
        }
        objs=new Object[this.size];
    }
    @Override
    void enqueue(Object element) {
        grow();
        objs[count++]=element;
    }

    @Override
    Object dequeue() {
        if(isEmpty()){
            return null;
        }
        Object obj=objs[0];
        System.arraycopy(objs,1,objs,0,size-1);
        count--;
        return obj;
    }

    @Override
    Object peek() {
        if(isEmpty()){
            return null;
        }
        return objs[0];
    }

    @Override
    boolean isEmpty() {
        return count==0;
    }

    @Override
    int size() {
        return count;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "队列：" + Arrays.toString(objs) +
                ", 容量：" + size +
                ", 元素个数：" + count +
                '}';
    }

    private void grow() {
        if(count==size){
            Object[] newObjs=new Object[objs.length+(objs.length>>1)];
            System.arraycopy(objs,0,newObjs,0,objs.length);
            objs=newObjs;
            this.size= objs.length;
        }
    }

}
class Test{
    public static void main(String[] args) {
        MyQueue myQueue=new MyQueue(2);
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.size());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue);
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.isEmpty());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.peek());
    }
}

