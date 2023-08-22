package day2_822.dynamic;

import java.util.Objects;

public class List {
    private Object[] objs;
    private int count=0;
    private int capacity;
    public List(){
        this(10);
    }
    public List(int capacity){
        this.capacity=capacity;
        objs=new Object[capacity];
    }

    /**
     * 向对象组中添加对象
     * @param obj 要添加的对象
     */
    public void add(Object obj){
        grow();
        objs[count++]=obj;
        System.out.println("添加成功!");
    }

    /**
     * 对象组扩容
     */
    private void grow(){
        if(count== objs.length){
            Object[] newObjs=new Object[objs.length*2];
            System.arraycopy(objs,0,newObjs,0,objs.length);
            objs=newObjs;
        }
    }

    /**
     * 找对象在对象组中的下标
     * @param obj 要找的对象
     * @return 对象所在下标(没有返回-1)
     */
    public int find(Object obj){
        for (int i = 0; i < count; i++) {
            if(Objects.equals(objs[i],obj)){
                return i;
            }
        }
        return -1;
    }
    /**
     * 直接删除对象(找到其在数组中的下标后删除下标所在对象)
     * @param obj 要删除的对象
     */
    public void delete(Object obj){
        int index=find(obj);
        deleteByIndex(index);
    }

    /**
     * 根据下标删除对象
     * @param index 要删除对象的下标
     */
    public void deleteByIndex(int index){
        if(index<0||index>=count){
            System.out.println("没有找到该对象!");
        }else{
            System.arraycopy(objs,index+1,objs,index,count-index-1);
            count--;
            System.out.println("删除成功!");
        }
    }

    /**
     * 修改对象
     * @param obj 要修改的对象
     * @param obj1 目标对象
     */
    public void update(Object obj,Object obj1){
        int index=find(obj);
        if(index<0){
            System.out.println("没有找到该对象");
        }else{
            objs[index]=obj1;
            System.out.println("修改成功!");
        }
    }

    /**
     * 判断下标是否越界
     * @param index 要判断的下标
     * @return 若在范围内返回true,否则返回false
     */
    private boolean judgeIndex(int index){
        return index >= 0 && index < count;
    }
    /**
     * 通过下标查找对象
     * @param index 查找的下标
     */
    public void findByIndex(int index){
        if(judgeIndex(index)){
            System.out.println(objs[index]);
        }else{
            System.out.println("找不到该对象!");
        }
    }

    /**
     * 查看对象组中所有对象
     */
    public void showAll(){
        for (int i = 0; i < count; i++) {
            System.out.println(objs[i]);
        }
    }
}
