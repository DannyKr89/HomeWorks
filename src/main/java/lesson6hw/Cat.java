package lesson6hw;

public class Cat extends Animal {
    public static int countCats = 0;
    public int maxRunDistance = 200;

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    public Cat(String name) {
        super(name);
        countCats++;
    }

    @Override
    public boolean run(int distance) {
        return distance > 0 && distance <= this.maxRunDistance;
    }

    @Override
    public boolean swim(int distance) {
        return false;
    }
}
