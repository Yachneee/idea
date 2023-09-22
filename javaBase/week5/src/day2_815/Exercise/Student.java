package day2_815.Exercise;

public class Student {
    String name;
    String gender;
    int age;
    int id;
    double score;
    public String say(){
        return "姓名："+name+",  性别："+ gender+",  年龄：" + age+",  编号："+ id+",  成绩：" + score;
    }
}
class StudentTest{
    public static void main(String[] args) {
        Student whd=new Student();
        whd.name ="王鹤棣";
        whd.gender ="男";
        whd.age =23;
        whd.id =1;
        whd.score =100;
        System.out.println(whd.say());
    }
}