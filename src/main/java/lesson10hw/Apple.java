package lesson10hw;

public class Apple extends Fruit {
    private static double weight = 1.0;
    private static String name = "Яблоко";


    public Apple(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public Apple() {
        this(weight, name);
    }

    @Override
    public String toString() {
        return name;
    }

    public static double getWeight() {
        return weight;
    }
}
