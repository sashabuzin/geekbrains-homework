package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Box<T extends Fruit & OrangeAndApple>{

    private final List<T> fruitInBox;

    public Box(T... fruits) {
        this.fruitInBox = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T fruit) {
        fruitInBox.add(fruit);
    }


    public float getWeight() {
        float tempWeight = 0.0f;
        for (T fruit : fruitInBox) {
            tempWeight += fruit.getWeight();
        }
        return tempWeight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    public void pourFruit(Box<T> box) {
        box.fruitInBox.addAll(fruitInBox);
        fruitInBox.clear();
    }

}
