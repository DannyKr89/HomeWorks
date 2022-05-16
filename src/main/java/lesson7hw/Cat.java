package lesson7hw;

import java.util.concurrent.ThreadLocalRandom;

public class Cat {
    private String name;
    private int appetit;
    private int maxToEat;
    private int needEat;
    private boolean isSatiety;

    public boolean isSatiety() {
        return isSatiety;
    }

    public String getName() {
        return name;
    }

    public Cat(String name) {
        this.name = name;
        appetit = ThreadLocalRandom.current().nextInt(2, 8) * 10;
        isSatiety = false;
    }

    public void eat(Plate plate) {
        if (appetit <= plate.getFood()) {
            plate.decreaseFood(appetit);
            System.out.printf("%s скушал %d корма", name, appetit);
            System.out.println();
            isSatiety = true;
        } else {
            System.out.printf("%s не хватает %d корма", name, appetit - plate.getFood());
            System.out.println();
        }
    }
}