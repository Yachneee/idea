package day4_831;

/**
 * @author Administrator
 */
public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
class Test{
    public static void main(String[] args){
        MyException e = new MyException("我的异常");
        try {
            throw e;
        } catch (MyException ec) {
            System.out.println(ec.getMessage());
            System.out.println(ec);
            System.out.println(ec.getCause());
            System.out.println(ec.getClass());
        }
    }
}