import java.util.Arrays;

class Student{
    int age;
    String name;
    Student(){}
    Student(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
/**
 * @author Administrator
 */
public class SortTwo{
    public static void main(String[] args) {
        Student[] stus={new Student("张三",18),new Student("李四",21),
                new Student("王五",20),new Student("张四",18)};
        insertSort(stus);
        System.out.println(Arrays.toString(stus));
        System.out.println("sz".compareTo("sl"));
    }

    static void insertSort(Student[] stus){
        for (int i = 1; i < stus.length; i++) {
            int j=i-1;
            Student current=stus[i];
            while(j>=0&&(stus[j].age<current.age||(stus[j].age==current.age && stus[j].name.compareTo(current.name)<0))){
                    //按年龄降序
                if(stus[j].age<current.age){
                    stus[j+1]=stus[j];
                }else{
                    stus[j+1]=stus[j];
                    //按姓名降序
                }
                j--;
            }
            stus[j+1]=current;
        }
    }
}