package day2_822.dynamic;

import day2_822.reviseAssign.Movie;
import day2_822.reviseAssign.User;

public class Test {
    public static void main(String[] args) {
        List movies=new List(20);
        Movie xsd=new Movie("消失的她",42.9,"饶晓志",20230622,10);
        Movie mjh=new Movie("满江红",19.9,"张艺谋",20230122,10);
        movies.add(xsd);
        movies.add(mjh);
        List users=new List(20);
        User u1=new User("manager","111111","man",1,10);
        User u2=new User("user","333333","user",2,10);
        users.add(u1);
        users.add(u2);
        users.showAll();
        movies.showAll();
//        users.deleteByIndex(1);
        users.delete(u2);
        users.findByIndex(0);
        users.update(u1,u2);
        users.showAll();
    }
}
