package lesson8hw.classes;

import lesson8hw.interfaces.Obstacles;
import lesson8hw.interfaces.Participant;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void makeThrough(Participant participant) {
        if (participant.getHeight() >= height){
            System.out.println(participant.getName() + " успешно перепрыгнул стену в " + height + " см.");
        } else {
            System.out.println(participant.getName() + " не смог перепрыгнуть стену в " + height + " см.");
        }
    }
}
