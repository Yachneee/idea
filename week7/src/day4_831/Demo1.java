package day4_831;

/**
 * @author Administrator
 */
public class Demo1 {
    public static void testOne() throws Exception {
        System.out.println("testOne()");
        throw new MyException("异常e1");
    }
    public static void testTwo() throws Exception {
        System.out.println("testTwo()");
        try{
            testOne();
        }catch (Exception e1){
            throw new Exception("新异常e2",e1);
        }
    }
    public static void testThree() throws Exception{
        System.out.println("testThree()");
        try {
            testTwo();
        }catch(Exception e2){
//            throw new Exception("新异常e3",e2);
            Exception e3=new Exception("新异常e3");
            e3.initCause(e2);
            throw e3;
        }
    }

    public static void main(String[] args) {
        try {
            testThree();
        }catch(Exception e3){
            System.out.println(e3.getMessage());
            Throwable e2=e3.getCause();
            System.out.println(e2.getMessage());
            Throwable e1=e2.getCause();
            System.out.println(e1);
            System.out.println(e1.getMessage());
            Throwable e=e1.getCause();
            System.out.println(e);
        }
    }
}
