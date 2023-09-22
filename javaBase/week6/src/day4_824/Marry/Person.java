package day4_824.Marry;

import java.util.Objects;

/**
 * @author Administrator
 */
public class Person {
    private String name;
    private Character gender;
    private Integer age;
    private Boolean married;
    public Person(){}
    public Person(String name,char gender,int age,Boolean married){
        this.name=name;
        this.gender= gender;
        this.age= age;
        this.married=married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean marry) {
        this.married = marry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(gender, person.gender) && Objects.equals(age, person.age) && Objects.equals(married, person.married);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, married);
    }

    @Override
    public String toString() {
        return "Person{" +
                "姓名：'" + name + '\'' +
                ", 性别：" + gender +
                ", 年龄：" + age +
                ", 婚姻状态：" + (married? "已婚":"未婚") +
                '}';
    }
}
