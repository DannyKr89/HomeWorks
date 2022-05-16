package lesson7hw;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Cat[] cats = new Cat[4];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws InterruptedException {
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Барсик");
        cats[2] = new Cat("Шарик");
        cats[3] = new Cat("Том");
        Plate plate = new Plate(100);
        plate.info();
        Thread.sleep(1000);
        plate.addFood(ThreadLocalRandom.current().nextInt(2, 6) * 10);
        Thread.sleep(1000);
        for (Cat cat : cats) {
            cat.eat(plate);
            Thread.sleep(1000);
            plate.info();
        }
        for (Cat cat : cats) {
            if (cat.isSatiety()) {
                sb.append(cat.getName() + " - сытый\n");
            } else {
                sb.append(cat.getName() + " - голодный\n");
            }
        }
        System.out.println(sb);


    }
}