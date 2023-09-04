package day1_904.pm.singleton;

/**
 * @author Administrator
 */

public enum Singleton {
    /**
     * 枚举实现单例模式，一个实例
     */
    instance;
}
class Test{
    public static void main(String[] args) {
        Singleton singleton=Singleton.instance;
        System.out.println(singleton);
    }
}
