package day1_925.handler;

public class StringHandler implements Handler<String>{

    @Override
    public String getOne(Object... objects) {
        return (String)objects[0];
    }
}