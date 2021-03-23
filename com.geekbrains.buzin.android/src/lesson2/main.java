package lesson2;



public class main {
    public static void main(String[] args) {
    fillDiagonal();
    }

    public static void invertArray() {
        int[] array = {1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
    }

    public static void fillArray() {
        int[] array = new int[8];
        int counterToIncreaseTheValueBy3 = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = counterToIncreaseTheValueBy3;
            counterToIncreaseTheValueBy3 += 3;
        }
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static void fillDiagonal() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < 4; j++){
                if (((i == 0 || i == 3) && (j == 0 || j == 3)) || ((i == 1 || i == 2) && (j == 1 || j == 2))){
                    array[i][j] = 1;
                }
            }
        }
    }




}
