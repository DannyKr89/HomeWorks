package lesson6hw;

public class Dog extends Animal {
    public static int countDogs = 0;
    public int maxRunDistance = 500;
    public int maxSwimDistance = 10;

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public int maxSwimDistance() {
        return maxSwimDistance;
    }

    public Dog(String name) {
        super(name);
        countDogs++;
    }

    @Override
    public boolean run(int distance) {
        return distance > 0 && distance <= this.maxRunDistance;
    }

    @Override
    public boolean swim(int distance) {
        return (distance > 0 && distance <= 10);
    }
}
