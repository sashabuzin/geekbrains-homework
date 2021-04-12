package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[7];
        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Murzik", 5);
        cats[2] = new Cat("Matroskin", 3);
        cats[3] = new Cat("Pyatnisty", 2);
        cats[4] = new Cat("Hvostaty", 7);
        cats[5] = new Cat("Banditnik", 8);
        cats[6] = new Cat("Keks", 5);
        Plate plate = new Plate(29);
        for(Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " сыт?: " + cat.isSatiety());
        }
        plate.addFood(10);
        plate.info();
    }

}
