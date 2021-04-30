package lesson10;

import java.util.*;

public class Phonebook {
    private static Map<String, List<String>> phoneBook = new HashMap<>();

    public void add (String surname, String number) {
        List<String> tempList = phoneBook.get(surname);
        if (tempList == null) {
            List<String> newTempList = new ArrayList<>();
            newTempList.add(number);
            phoneBook.put(surname, newTempList);
        } else {
            tempList.add(number);
        }
    }

    public List<String> get (String surname) {
        return phoneBook.get(surname);
    }

}
