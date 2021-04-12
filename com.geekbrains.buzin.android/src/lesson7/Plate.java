package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public int getFood() {
        return food;
    }

    public void addFood(int countFood) {
        food += countFood;
    }

    public void info() {
    System.out.println("plate: " + food);
    }
}
