package lesson9;

public class TestForExceptions {

    public int myArrayExceptions (String[][] array){
        int sumOfNumbers = 0;
            if (is4x4array(array)) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        if (isParseInt(array[i][j])) {
                            sumOfNumbers += Integer.parseInt(array[i][j]);
                        }
                    }
                }
            }
            return sumOfNumbers;
        }

    public boolean is4x4array (String[][] array) throws MyArraySizeException {
        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length !=4) throw new MyArraySizeException("Массив размерностью не 4х4");
            }
            return true;
        }
        throw new MyArraySizeException();
    }

    public boolean isParseInt (String intStr) {
        try {
            Integer.parseInt(intStr);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
