package day5_915;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author Administrator
 */
public class PrintDemo {
    public static void main(String[] args) {
        File file = new File("week9/src/day5_915/text/printStream");
        try (PrintStream stream = new PrintStream(file)) {
            stream.print("""
                    hello
                    world
                    你好
                    """);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
