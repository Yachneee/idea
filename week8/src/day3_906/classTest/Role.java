package day3_906.classTest;

import java.util.Objects;

/**
 * @author Administrator
 */
public class Role {
    private String name;
    private String attribute;
    private String rare;
    private int lifeSeat;
    private int grade;
    public Role(String name,String attribute,String rare,int lifeSeat,int grade){
        this.name=name;
        this.attribute=attribute;
        this.rare=rare;
        this.lifeSeat=lifeSeat;
        this.grade=grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getLifeSeat() {
        return lifeSeat;
    }

    public String getRare() {
        return rare;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return lifeSeat == role.lifeSeat && grade == role.grade && Objects.equals(name, role.name) && Objects.equals(attribute, role.attribute) && Objects.equals(rare, role.rare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attribute, rare, lifeSeat, grade);
    }

    @Override
    public String toString() {
        return "Role{" +
                "角色名称：'" + name + '\'' +
                ", 属性：'" + attribute + '\'' +
                ", 稀有度：'" + rare + '\'' +
                ", 命座：" + lifeSeat +
                ", 等级：Lv." + grade +
                '}';
    }
}
