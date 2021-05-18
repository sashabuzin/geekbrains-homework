package lesson14;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayTest test = new ArrayTest();
        int[] testArr = { 4, 1, 2, 3, 5 };
        test.arrayAfterLastFour(testArr);
        int[] testArr2 = {1, 4, 1, 4};
        System.out.println(test.includesOneAndFour(testArr2));
    }
}
