package lesson8hw.classes;

import lesson8hw.interfaces.Obstacles;
import lesson8hw.interfaces.Participant;

public class Treadmill implements Obstacles {
    private int distance;
    private boolean pass;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void makeThrough(Participant participant) {
        if (participant.getDistance() >= distance) {
            pass = true;
            System.out.println(participant.getName() + " успешно пробежал дистанцию в " + distance + " км.");
        } else {
            pass = false;
            System.out.println(participant.getName() + " не смог пробежать дистанцию " + distance + " км.");
        }
    }

    @Override
    public boolean getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Беговая дорожка " + distance + " км.";
    }
}
