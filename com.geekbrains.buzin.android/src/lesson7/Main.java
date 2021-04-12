package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("barsik");
        Dog sharik = new Dog("sharik");
//        Dog shark = new Dog("shark");
        Cat shrik = new Cat("shrik");
        barsik.swimming(100);
        barsik.run(50);
        barsik.run(250);
        barsik.run(-10);
        sharik.run(100);
        sharik.run(550);
        sharik.run(-10);
        sharik.swimming(5);
        sharik.swimming(20);
        System.out.println();
        System.out.println(barsik.countCreateObject());
    }
}
