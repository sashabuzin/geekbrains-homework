package lesson1;

public class main {
    public static void main(String[] args) {
        byte b = 2;
        short s = 300;
        int i = 2000000;
        long l = 2300000000L;
        float f = 10.06565F;
        double d = 200.86776;
        boolean bool = true;
        String str = "Строка";
        helloName("Саша");
        isLeap(2005);

    }

    public static float mathOperation(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    public static boolean from10To20(int a, int b) {
        if ((a + b) >= 10 && (a + b <=20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void isItPositive(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isItPositiveBool(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void helloName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void isLeap(int year) {
        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

}
