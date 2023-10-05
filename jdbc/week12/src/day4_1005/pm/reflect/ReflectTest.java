package day4_1005.pm.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Administrator
 */
public class ReflectTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        System.out.println(studentClass.getPackageName());
        //包名
        System.out.println(studentClass.getCanonicalName());
        //规范名称
        System.out.println("\033[35mgetConstructor()\033[0m");
        Constructor<Student> constructor = studentClass.getConstructor();
        //无参 public
        System.out.println(constructor.getParameterCount());
        System.out.println("\033[35mgetConstructor(String.class)\033[0m");
        Constructor<Student> constructor1 = studentClass.getConstructor(String.class);
        //1个参数（name） public
        System.out.println(constructor1.getParameterCount());
        System.out.println("\033[35mgetConstructors()\033[0m");
        Constructor<?>[] constructors = studentClass.getConstructors();
        //所有public构造
        for (Constructor<?> c: constructors) {
            System.out.print(c.getParameterCount()+"\t");
        }
        System.out.println();
        System.out.println("\033[35mgetDeclaredConstructor(String.class, int.class)\033[0m");
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class, int.class);
        //（name,id）构造(private)
        System.out.println(declaredConstructor.getParameterCount());
        declaredConstructor.setAccessible(true);
        //不再检查访问修饰符
        Student zs = declaredConstructor.newInstance("张三", 1);
        System.out.println(zs);
    }
}
