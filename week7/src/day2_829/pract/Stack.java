package day2_829.pract;

import java.util.Arrays;
import java.util.Objects;

public abstract class Stack {

    /**
     * 入栈
     * 将元素压入栈顶
     * @param element 要入栈的元素
     */
    abstract void push(Object element);

    /**
     * 出栈
     * 弹出栈顶元素并返回
     * 返回栈顶要删除的元素
     * @return 弹出的栈顶元素, 如果栈为空返回 null
     */
    abstract Object pop();

    /**
     * 返回栈顶元素，但不弹出
     * @return 栈顶元素
     */
    abstract Object peek();

    /**
     * 检查栈是否为空
     * @return 如果栈为空则返回true，否则返回false
     */
    abstract boolean isEmpty();

    /**
     * 返回栈中的元素个数
     * @return 栈中的元素个数
     */
    abstract int size();
}
class MyStack extends Stack{
    private Object[] objs;
    private int capacity=10;
    private int count=0;
    public MyStack(){
        this(10);
    }
    public MyStack(int capacity){
        if(capacity<this.capacity){
            capacity=this.capacity;
        }
        this.capacity=capacity;
        objs=new Object[capacity];
    }
    @Override
    void push(Object element) {
        growStack();
        objs[count++]=element;
    }

    @Override
    Object pop() {
        if(isEmpty()){
            return null;
        }
        Object top=objs[count-1];
//        System.arraycopy(objs,count,objs,count-1,objs.length-count);
        objs[count-1]=null;
        count--;
        return top;
    }

    @Override
    Object peek() {
        if(!isEmpty()){
            return objs[count-1];
        }
        return null;
    }

    @Override
    boolean isEmpty() {
        return count == 0;
    }

    @Override
    int size() {
        return count;
    }
    private void growStack(){
        if(count==capacity){
            Object[] objects=new Object[capacity*2];
            System.arraycopy(objs,0,objects,0,capacity);
            objs=objects;
        }
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "栈：" + Arrays.toString(objs) +
                ", 容量：" + capacity +
                ", 元素个数：" + count +
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
        MyStack myStack = (MyStack) o;
        return capacity == myStack.capacity && count == myStack.count && Arrays.equals(objs, myStack.objs);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, count);
        result = 31 * result + Arrays.hashCode(objs);
        return result;
    }
}
class Student{
    private String name;
    private int age;
    public Student(){}
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名：'" + name + '\'' +
                ", 年龄：" + age +
                '}';
    }

}
class Test{
    public static void main(String[] args) {
        Student st1=new Student("张三",18);
        Student st2=new Student("李四",20);
        int n=1;
        MyStack myStack=new MyStack();
        myStack.push(st1);
        myStack.push(st2);
        myStack.push(n);
        System.out.println(myStack.isEmpty());
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());
    }
}