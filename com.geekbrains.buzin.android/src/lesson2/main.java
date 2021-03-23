package lesson2;

import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) {

        int[] practice1 = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < practice1.length; i++) {
            if (practice1[i] == 1) {
                practice1[i] = 0;
            } else practice1[i] = 1;
        }

        int[] practice2 = new int[8];
        int counterToIncreaseTheValueBy3 = 0;
        for (int i = 0; i < practice2.length; i++) {
            practice2[i] = counterToIncreaseTheValueBy3;
            counterToIncreaseTheValueBy3 += 3;
        }

        int[] practice3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < practice3.length; i++) {
            if (practice3[i] < 6) {
                practice3[i] *= 2;
            }
        }

    }

}
