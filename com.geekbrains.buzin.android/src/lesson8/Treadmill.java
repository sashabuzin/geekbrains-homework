package lesson8;

public class Treadmill implements Barrier {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void overcomingAnObstacle (runnerAndJumper subject) {
        subject.running(getDistance());
    }
}
