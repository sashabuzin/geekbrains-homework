package lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(Data.dataArray));
        Set<String> uniqueElements = new HashSet<>(arrayList);
        Map<String, Integer> countingRepetitions = new HashMap<>();
        System.out.println("Входной массив слов: " + arrayList);
        System.out.println("Массив уникальных слов: " + uniqueElements);

        for (String word : arrayList) {
            Integer val = countingRepetitions.get(word);
                if (val == null) {
                    countingRepetitions.put(word, 1);
                } else {
                    countingRepetitions.put(word, val + 1);
                }
        }
        System.out.println("Подсчет повторений слов в первоначальном массиве: " + countingRepetitions);

    }
}
