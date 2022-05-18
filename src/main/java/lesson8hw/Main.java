package lesson8hw;

import lesson8hw.classes.*;
import lesson8hw.interfaces.Obstacles;
import lesson8hw.interfaces.Participant;

import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        Participant men = new Men("Человечек", ThreadLocalRandom.current().nextInt(5, 40), ThreadLocalRandom.current().nextInt(100, 250));
        Participant cat = new Cat("Котик", ThreadLocalRandom.current().nextInt(1, 20), ThreadLocalRandom.current().nextInt(60, 240));
        Participant robot = new Robot("Ведерко", ThreadLocalRandom.current().nextInt(5, 100), ThreadLocalRandom.current().nextInt(200, 500));
        Obstacles threadmill = new Treadmill(ThreadLocalRandom.current().nextInt(1, 100));
        Obstacles wall = new Wall(ThreadLocalRandom.current().nextInt(60, 500));
        Participant[] participants = {men, cat, robot};
        Obstacles[] obstacles = {threadmill, wall};
        introducing(participants, obstacles);
        obstacleCourse(participants, obstacles);
    }

    private static void introducing(Participant[] participants, Obstacles[] obstacles) {
        System.out.println("Предсавляем вам наших сегодняшних участников:");
        for (int i = 0; i < participants.length; i++) {
            System.out.println(participants[i]);
        }
        System.out.println();
        System.out.println("Вот наше припятствие:");
        for (int i = 0; i < obstacles.length; i++) {
            System.out.println(obstacles[i]);
        }
        System.out.println();
    }

    private static void obstacleCourse(Participant[] participants, Obstacles[] obstacles) {
        for (int i = 0; i < participants.length; i++) {
            int pass = 0;
            for (int j = 0; j < obstacles.length; j++) {
                obstacles[j].makeThrough(participants[i]);
                if (!obstacles[j].getPass()) {
                    System.out.println(participants[i].getName() + " выбывает из соревнования.");
                    System.out.println();
                    break;
                } else {
                    pass++;
                }
                if (pass == obstacles.length) {
                    System.out.println(participants[i].getName() + " успешно прошел все препятсвия!!");
                }
            }
        }
    }
//    private static String name(){
//        String name = Names.valueOf();
//        return name;
//    }
}
