package lesson6;

public class Dog extends Animal {

    protected int maxDogRunDistance = 500;
    protected int maxDogSwimmingDistance = 10;

    protected static int dogCount = 0;

    Dog(String name) {
        this.name = name;
        this.maxRunDistance = maxDogRunDistance;
        this.maxSwimmingDistance = maxDogSwimmingDistance;
        dogCount++;
    }

    @Override
    public int countCreateObject () {
        return dogCount;
    }

}
