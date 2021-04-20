package lesson8;

public class Cat implements runnerAndJumper {
    private int maximumRunDistance;
    private int maximumJumpHeigth;
    private boolean isParticipant = true;

    public Cat(int maximumRunDistance, int maximumJumpDistance) {
        this.maximumRunDistance = maximumRunDistance;
        this.maximumJumpHeigth = maximumJumpDistance;
    }

    public int getMaximumRunDistance() {
        return maximumRunDistance;
    }

    public void setMaximumRunDistance(int maximumRunDistance) {
        this.maximumRunDistance = maximumRunDistance;
    }

    public int getMaximumJumpHeigth() {
        return maximumJumpHeigth;
    }

    public void setMaximumJumpHeigth(int maximumJumpHeigth) {
        this.maximumJumpHeigth = maximumJumpHeigth;
    }

    public boolean isParticipant() {
        return isParticipant;
    }

    public void setParticipant(boolean participant) {
        isParticipant = participant;
    }

    public void jumping(int heigth) {
        if (!isParticipant()) {
            System.out.println("Силы котика иссякли и он не участвует в прыжках");
            return;
        }

            if (maximumJumpHeigth >= heigth) {
                System.out.println("Котик прыгнул и преодолел препятствие");
                setMaximumJumpHeigth(getMaximumJumpHeigth() - heigth);
            } else {
                System.out.println("Запас сил котика иссяк");
                setParticipant(false);
            }

    }

    public void running(int distance) {
        if (!isParticipant()) {
            System.out.println("Силы котика иссякли и он не участвует в беге");
            return;
        }

            if (maximumRunDistance >= distance) {
                System.out.println("Котик пробежал всё расстояние по беговой дорожке");
                setMaximumRunDistance(getMaximumRunDistance() - distance);
            } else {
                System.out.println("Запас сил котика иссяк");
                setParticipant(false);
            }

    }
}
