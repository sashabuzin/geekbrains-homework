package lesson9;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        TestForExceptions test = new TestForExceptions();
        String[][] testStr = {{"1","ab","1","1"},{"1","1","1","1"},{"1","1","1","1"},{"1","1","1","1"}};
        System.out.println(test.myArrayExceptions(testStr));

    }
}
