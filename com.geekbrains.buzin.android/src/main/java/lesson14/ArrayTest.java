package lesson14;

import java.util.Arrays;

public class ArrayTest {
    public int[] arrayAfterLastFour (int[] arrInput) {
        int[] arrTemp;
            for (int i = arrInput.length - 1; i >= 0; i--) {
                if (arrInput[i] == 4) {
                    arrTemp = new int[arrInput.length - i - 1];
                        System.arraycopy(arrInput, i + 1, arrTemp, 0, arrTemp.length);
                    System.out.println(Arrays.toString(arrTemp));
                    return arrTemp;
                }
            }

        throw new RuntimeException();
    }

    public boolean includesOneAndFour (int[] arr) {
        boolean includeOne = false;
        boolean includeFour = false;
        for (int value : arr) {
            if (value == 1) {
                includeOne = true;
            } else if (value == 4) {
                includeFour = true;
            } else return false;
        }
        return includeFour && includeOne;
    }

}
