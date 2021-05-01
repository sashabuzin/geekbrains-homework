package lesson11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Orange[] oranges = {new Orange(), new Orange(), new Orange()};
        Box<Orange> orangeBox = new Box<>(oranges);
        orangeBox.addFruit(new Orange());
        System.out.println(orangeBox.getWeight());
    }
}
