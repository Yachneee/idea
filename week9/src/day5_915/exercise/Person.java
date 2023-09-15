package day5_915.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Administrator
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable,Cloneable {
    private String name;
    private String no;
    private Person son;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person clone=new Person();
        clone.setName(name);
        clone.setNo(no);
        if(son==null){
            return clone;
        }
        clone.setSon((Person) (son.clone()));
        return clone;
    }
}