package lesson8hw.classes;

import lesson8hw.interfaces.Participant;

public class Men implements Participant {
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

    public Men(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        System.out.println("Человек бегает");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгает");

    }

    @Override
    public String toString() {
        return "Человек с именем " + name + ", способный пробежать дистанцию в " + distance + " км., и прыгнуть через стену высотой " + height + " см.";
    }
}
