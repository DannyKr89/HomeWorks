package lesson8hw.classes;

import lesson8hw.interfaces.Obstacles;
import lesson8hw.interfaces.Participant;

public class Wall implements Obstacles {
    private int height;
    private boolean pass;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void makeThrough(Participant participant) {
        if (participant.getHeight() >= height){
            pass = true;
            System.out.println(participant.getName() + " успешно перепрыгнул стену в " + height + " см.");
        } else {
            pass = false;
            System.out.println(participant.getName() + " не смог перепрыгнуть стену в " + height + " см.");
        }
    }

    @Override
    public boolean getPass() {
        return pass;
    }

    @Override
    public String toString() {
        return "Стена высотой " + height + " см.";
    }
}
