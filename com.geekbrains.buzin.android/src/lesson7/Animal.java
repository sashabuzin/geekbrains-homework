package lesson7;

public class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimmingDistance;

    static int animalCount = 0;

    Animal() {
        animalCount++;
    }

    public void run (int distance) {

        if (distance >= 0 && distance <= maxRunDistance) {
            System.out.println(this.name + " пробежал " + distance + " метров.");
        } else if (distance > maxRunDistance){
            System.out.println(this.name + " пробежал " + maxRunDistance + " метров.");
        } else System.out.println("Некорректно указана дистанция");
    }

    public void swimming (int distance) {

        if (distance >= 0 && distance <= maxSwimmingDistance) {
            System.out.println(this.name + " проплыл " + distance + " метров.");
        } else if (distance > maxSwimmingDistance){
            System.out.println(this.name + " проплыл " + maxSwimmingDistance + " метров.");
        } else System.out.println("Некорректно указана дистанция");
    }

    public int countCreateObject () {
        return animalCount;
    }

}
