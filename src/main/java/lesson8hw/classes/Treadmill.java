package lesson8hw.classes;

import lesson8hw.interfaces.Obstacles;
import lesson8hw.interfaces.Participant;

public class Treadmill implements Obstacles {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void makeThrough(Participant participant) {
        if (participant.getDistance() >= distance){
            System.out.println(participant.getName() + " успешно пробежал дистанцию в " + distance + " км.");
        } else {
            System.out.println(participant.getName() + " не смог пробежать дистанцию " + distance + " км.");
        }
    }
}
