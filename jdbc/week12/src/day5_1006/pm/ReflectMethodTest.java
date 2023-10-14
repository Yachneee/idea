package day5_1006.pm;

import day5_1006.am.Student;

import java.lang.reflect.Method;

/**
 * @author Administrator
 */
public class ReflectMethodTest {
    public static void main(String[] args) {
        Class<Student> aClass = Student.class;
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
    }
}
