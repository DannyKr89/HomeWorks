package lesson1hw;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        chekSumSign();
        printColor();
        compareNumbers();
    }

    private static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    private static void chekSumSign() {
        int a = 5;
        int b = -8;
        int z = a + b;
        if (z >= 0) {
            System.out.println("����� �������������");
        } else
            System.out.println("����� �������������");
    }

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("�������");
        } else if (value > 0 && value <= 100) {
            System.out.println("������");
        } else if (value > 100) {
            System.out.println("�������");
        }
    }

    private static void compareNumbers() {
        int a = 20;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }
}
