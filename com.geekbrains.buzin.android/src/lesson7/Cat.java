package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (this.appetite <= p.getFood()) {
            while (!isSatiety()) {
                p.decreaseFood(appetite);
                setSatiety(true);
            }
        }
    }

}
