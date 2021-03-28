package lesson3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;



public class Game2 {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic",
            "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
            "pea", "peanut", "pear", "pepper", "pineapple",
            "pumpkin", "potato"};
    public static void game2Start() {

        do {
            boolean inGame = true;
            String hiddenString = WORDS[random.nextInt(WORDS.length)];

                while (inGame == true) {

                    System.out.println("Попробуйте угадать загаданное слово");
//                    System.out.println(hiddenString);
                    String userAnswer = scanner.next().toLowerCase();
                    char[] matchingСharacters = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#',};

                    if (userAnswer.equals(hiddenString)) {
                        System.out.println("Вы угадали! Игра закончена");
                        inGame = false;
                    } else {
                        if (userAnswer.length() >= hiddenString.length()) {
                            for (int i = 0; i < hiddenString.length(); i++) {
                                if (hiddenString.charAt(i) == (userAnswer.charAt(i))) {
                                    matchingСharacters[i] = hiddenString.charAt(i);
                                } else {
                                    matchingСharacters[i] = '#';
                                }
                            }

                        } else {
                            for (int i = 0; i < userAnswer.length(); i++) {
                                if (hiddenString.charAt(i) == (userAnswer.charAt(i))) {
                                    matchingСharacters[i] = hiddenString.charAt(i);
                                } else {
                                    matchingСharacters[i] = '#';

                                }
                            }

                        }
                        System.out.println(matchingСharacters);
                    }


                }


            System.out.print("Хотите ли поиграть заново? (1/0) -> ");
        } while (scanner.nextInt() == 1);
        scanner.close();
    }

}
