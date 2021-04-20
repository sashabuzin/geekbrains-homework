package lesson8;

public class Human implements runnerAndJumper {
    private int maximumRunDistance;
    private int maximumJumpHeigth;
    private boolean isParticipant = true;

    public Human(int maximumRunDistance, int maximumJumpDistance) {
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
        this.isParticipant = participant;
    }

    public void jumping(int heigth) {
        if (!isParticipant()) {
            System.out.println("Силы человека иссякли и он не участвует в прыжках");
            return;
        }
            if (maximumJumpHeigth >= heigth && isParticipant()) {
                System.out.println("Человек прыгнул и преодолел препятствие");
                setMaximumJumpHeigth(getMaximumJumpHeigth() - heigth);
            } else {
                System.out.println("Запас сил человека иссяк");
                setParticipant(false);
            }


    }

    public void running(int distance) {
        if (!isParticipant()) {
            System.out.println("Силы человека иссякли и он не участвует в беге");
            return;
        }

            if (maximumRunDistance >= distance && isParticipant()) {
                System.out.println("Человек пробежал всё расстояние по беговой дорожке");
                setMaximumRunDistance(getMaximumRunDistance() - distance);
            } else {
                System.out.println("Запас сил человека иссяк");
                setParticipant(false);
            }

    }
}
