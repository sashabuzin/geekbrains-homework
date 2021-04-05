package lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Anton", "junior android dev",
                "00000@gmail.com", "9800000000", 30000, 27);
        personArray[1] = new Person("Alexey", "senior android dev",
                "11111@gmail.com", "9801111111", 250000, 42);
        personArray[2] = new Person("Dmitry", "middle android dev",
                "22222@gmail.com", "9802222222", 110000, 33);
        personArray[3] = new Person("Andrew", "middle android dev",
                "33333@gmail.com", "9803333333", 90000, 35);
        personArray[4] = new Person("Vasily", "senior android dev",
                "44444@gmail.com", "9804444444", 170000, 45);

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                personArray[i].printInformationAboutPerson();
            }
        }
    }


}
