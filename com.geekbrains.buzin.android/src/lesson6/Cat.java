package lesson6;

public class Cat extends Animal {

    protected int maxCatRunDistance = 200;
    protected int maxCatSwimmingDistance = 0;

    static int catCount = 0;

    Cat(String name) {
        this.name = name;
        this.maxRunDistance = maxCatRunDistance;
        this.maxSwimmingDistance = maxCatSwimmingDistance;
        catCount++;
    }

    @Override
    public void swimming (int distance) {
        System.out.println("Кот не умеет плавать");
    }

    @Override
    public int countCreateObject () {
        return catCount;
    }

}