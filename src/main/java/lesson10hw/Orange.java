package lesson10hw;

public class Orange extends Fruit {
    private static double weight = 1.5;
    private static String name = "Апельсин";


    public Orange(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }
    public Orange() {
        this(weight,name);
    }

    public static double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }
}
