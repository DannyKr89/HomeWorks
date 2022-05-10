package lesson6hw;

public class Animal {
    public String name;
    public static int countAnimals;

    public int maxRunDistance() {
        return 0;
    }

    public int maxSwimDistance() {
        return 0;
    }

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public boolean run(int distance) {
        return false;
    }

    public boolean swim(int distance) {
        return false;
    }
}
