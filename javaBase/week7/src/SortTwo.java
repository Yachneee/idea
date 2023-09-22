import java.util.Arrays;

class Student{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    Student(){}
    Student(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student{" +
                " 姓名：'" + name+'\''+
                ", 年龄：'" + age + '\'' +
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
//        insertSort(stus);
        quickSort(stus,0, stus.length-1);
        System.out.println(Arrays.toString(stus));

    }

    static void insertSort(Student[] stus){
        for (int i = 1; i < stus.length; i++) {
            int j=i-1;
            Student current=stus[i];
            while(j>=0&&(stus[j].getAge()<current.getAge()||(stus[j].getAge()==current.getAge() && stus[j].getName().compareTo(current.getName())<0))){
                    //按年龄降序
                if(stus[j].getAge()<current.getAge()){
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
    static void quickSort(Student[] students,int left,int right){
        if(left>=right){
            return;
        }
        Student bench=students[left];
        int i=left;
        int j=right;
        while (i<j){
            //从右向左找年龄>=基准年龄的&&与基准年龄相等时姓名比基准姓名大的--> 年龄<基准年龄，||年龄相等时姓名<=基准姓名的 过掉
            while(i<j && (students[j].getAge()<bench.getAge()||(students[j].getAge()==bench.getAge()&&students[j].getName().compareTo(bench.getName())<=0))){
                j--;
            }
            //从左向右找年龄<=基准年龄&&与基准年龄相等时姓名比基准姓名小的--> 年龄>基准年龄，||年龄相等时姓名>=基准姓名的 过掉
            while(i<j && (students[i].getAge()>bench.getAge()||(students[i].getAge()==bench.getAge()&&students[i].getName().compareTo(bench.getName())>=0))){
                i++;
            }
            if(i<j){
                Student student=students[i];
                students[i]=students[j];
                students[j]=student;
            }
        }
        students[left]=students[i];
        students[i]=bench;
        quickSort(students,left,i-1);
        quickSort(students,i+1,right);
    }
}