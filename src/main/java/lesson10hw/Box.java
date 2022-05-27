package lesson10hw;

public class Box<E> {
    private E[] box;
    private static final int DEFAULT_SIZE = 5;

    private int element;
    private int id;

    public Box(int size) {
        this.box = (E[]) new Object[size];
        element = 0;
        id++;
    }
    public Box() {
        this(DEFAULT_SIZE);
    }

    public void add(E name) {
        if (element == box.length) {
            E[] box1 = (E[]) new Object[box.length + 5];
            for (int i = 0; i < box.length; i++) {
                box1[i] = box[i];
            }
            box = box1;
        }
        box[element] = name;
        element++;
    }


    public void printInfo() {
        System.out.println("В коробке: ");
        for (E box : box) {
            System.out.println(box);
        }
    }

    public double getWeight() {
        if (box[0] instanceof Apple){
            return element * Apple.getWeight();
        }
        if (box[0] instanceof Orange){
            return element * Orange.getWeight();
        }
        return 0;
    }

    public boolean compare(Box<?> box) {
        if (this.getWeight() == box.getWeight()){
            return true;
        } else {
            return false;
        }
    }
}
