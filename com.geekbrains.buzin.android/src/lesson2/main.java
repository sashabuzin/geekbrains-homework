package lesson2;

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
        for (int i = 0; i < practice2.length; i++)
            practice2[i] = counterToIncreaseTheValueBy3;
            counterToIncreaseTheValueBy3 += 3;
    }

}
