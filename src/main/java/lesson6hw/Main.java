package lesson6hw;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int distance;


    public static void main(String[] args) {
        int ask;
        do {
            System.out.println("\nХотите добавить новое животное? \n1 - Кота\n2 - Собаку\n3 - Закончить добавление животного");
            ask = sc.nextInt();
            if (ask == 1) {
                makeCat();
            }
            if (ask == 2) {
                makeDog();
            }
        } while (ask == 1 || ask == 2);
        System.out.printf("\nВсего животных - %d, из них %d котов и %d собак!",Animal.countAnimals,Cat.countCats,Dog.countDogs);
        sc.close();
    }

    private static void makeCat() {
        System.out.print("Введите имя кота - ");
        Animal animal = new Cat(sc.next());
        run(animal);
        swim(animal);
    }

    private static void makeDog() {
        System.out.print("Введите имя собаки - ");
        Animal animal = new Dog(sc.next());
        run(animal);
        swim(animal);
    }

    private static void run(Animal animal) {
        System.out.print("Введите дистанцию для бега - ");
        distance = sc.nextInt();
        if (animal.run(distance)) {
            System.out.println(animal.name + " может пробежать " + distance + " м.");
        } else {
            System.out.println(animal.name + " не сможет преодолеть дистанцию " + distance + " м. Максимум " + animal.maxRunDistance() + " м.");
        }
    }

    private static void swim(Animal animal) {
        if (animal instanceof Cat){
            System.out.println("Кот не умеет плавать");
        } else {
            System.out.print("Введите дистанцию для плавания - ");
            distance = sc.nextInt();
            if (animal.swim(distance)) {
                System.out.println(animal.name + " может проплыть " + distance + " м.");
            } else {
                System.out.println(animal.name + " не сможет преодолеть дистанцию " + distance + " м. Максимум " + animal.maxSwimDistance() + " м.");
            }
        }
    }


}
