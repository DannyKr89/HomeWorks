package lesson8hw.classes;

import lesson8hw.interfaces.Participant;

public class Robot implements Participant {
    private String name;
    private int distance;
    private int height;

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    public Robot(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        System.out.println("Робот бегает");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
}
