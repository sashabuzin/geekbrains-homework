package lesson8;

public class Wall implements Barrier {
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public void overcomingAnObstacle (runnerAndJumper subject) {
        subject.jumping(getHeigth());
    }
}
