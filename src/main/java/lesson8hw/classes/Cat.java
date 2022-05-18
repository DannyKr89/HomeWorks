package lesson8hw.classes;

import lesson8hw.interfaces.Participant;

public class Cat implements Participant {
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

    public Cat(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        System.out.println("Кот бегает");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");

    }
}
