package day5_908.pm;


import day5_908.am.Student;
public class MyList <T> {
    Object[] objects;
    int count;
    MyList(){
        objects=new Object[10];
    }
    public T add(T t){
        objects[count++]=t;
        return t;
    }
    public T get(int index){
        if(index>=count){
            return null;
        }
        return (T) objects[index];
    }
    public static void main(String[] args) {
        MyList<Student> studentMyList=new MyList<>();
        studentMyList.add(new Student("张三",18));
        System.out.println(studentMyList.get(0));
    }
}
