package lesson10hw;

public class Main {

    public static void main(String[] args) {
        Box<Apple> boxA = new Box<>();
        Box<Orange> boxO = new Box<>();
        boxA.add(new Apple());
        boxA.add(new Apple());
        boxA.add(new Apple());
        boxA.add(new Apple());
        boxA.add(new Apple());
        boxA.add(new Apple());

        boxO.add(new Orange());
        boxO.add(new Orange());
        boxO.add(new Orange());
        boxO.add(new Orange());

        boxA.printInfo();
        boxO.printInfo();

        System.out.println("Вес коробки с Яблоками: " + boxA.getWeight());
        System.out.println("Вес коробки с Апельсинами: " + boxO.getWeight());

        if (boxA.compare(boxO)){
            System.out.println("Коробки равны по весу!");
        } else {
            System.out.println("Коробки не равны по весу!");
        }

    }


}
