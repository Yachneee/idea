package day3_816.exercise;

public class Student {
    //包含以下属性和方法：
    // 属性：姓名（name）、年龄（age）、学号（studentId）、成绩（score）
    // 方法：构造方法、获取姓名的方法、获取年龄的方法、获取学号的方法、获取成绩的方法、设置成绩的方法
    private String name;
    private int age;
    private int studentId;
    private double score;
    public Student(String name,int age,int studentId){
        this.name=name;
        this.age=age;
        this.studentId=studentId;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getStudentId(){
        return studentId;
    }
    public double getScore(){
        return score;
    }
    public void setScore(double score){
        if(score>0){
            this.score=score;
        }else{
            System.out.println("你输入的成绩不合理");
        }
    }
}
