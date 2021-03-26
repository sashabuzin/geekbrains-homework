package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Game1 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static final int MAXIMUM_HIDDEN_NUMBER = 9;
    static final int COUNT_ATTEMPTS = 3;

    public static void game1Start() {

        do {
            boolean isWin = false;
            int hiddenNumber = random.nextInt(MAXIMUM_HIDDEN_NUMBER + 1);
            int remainingCountAttempts = COUNT_ATTEMPTS;
            while (remainingCountAttempts >= 1 && !isWin) {
                System.out.println("Угадайте число от 0 до 9, у вас " + remainingCountAttempts + " попытки -> ");
                int enteredNumber = scanner.nextInt();

                if (enteredNumber != hiddenNumber) {
                    remainingCountAttempts--;
                    if (remainingCountAttempts > 0) {
                        System.out.println("Вы не угадали, повторите попытку -> ");
                    } else {
                        System.out.println("Вы проиграли :((");
                    }
                } else {
                    remainingCountAttempts--;
                    System.out.println("Вы угадали с " + Math.abs(remainingCountAttempts - COUNT_ATTEMPTS) + " попытки");
                    isWin = true;
                }
            }
            System.out.print("Хотите ли поиграть заново? (Y/N) -> ");
        } while (scanner.next().toUpperCase().equals("Y"));


    }

}
