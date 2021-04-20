package lesson8;

public class Main {
    public static void main(String[] args) {

        runnerAndJumper[] arrayOfParticipants = {new Human(1000, 100),
                new Robot(3000, 200),
                new Cat(500, 400)};

        Barrier[] barrier = {new Treadmill(900), new Wall(150)};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                barrier[i].overcomingAnObstacle(arrayOfParticipants[j]);
            }
        }

    }




}
