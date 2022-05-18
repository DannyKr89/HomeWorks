package lesson8hw;

import lesson8hw.classes.*;
import lesson8hw.interfaces.Obstacles;
import lesson8hw.interfaces.Participant;

public class Main {
    public static void main(String[] args) {
        Participant men = new Men("Человечек", 20, 150);
        Participant cat = new Cat("Котик", 2, 100);
        Participant robot = new Robot("Ведерко", 40, 300);
        Obstacles wall = new Wall(100);
        Obstacles threadmill = new Treadmill(20);
        threadmill.makeThrough(men);
        threadmill.makeThrough(cat);
        threadmill.makeThrough(robot);
        wall.makeThrough(men);
        wall.makeThrough(cat);
        wall.makeThrough(robot);
    }
}
