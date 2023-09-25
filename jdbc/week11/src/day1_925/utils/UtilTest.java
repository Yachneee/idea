package day1_925.utils;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Administrator
 */
public class UtilTest {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        BookManager manager=new BookManager();
        manager.open();
    }
}
