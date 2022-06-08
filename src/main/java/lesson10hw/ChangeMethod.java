package lesson10hw;

public class ChangeMethod {
    public static void main(String[] args) {
        Integer[] nums = {15, 65, 35, 45, 25, 75};
        String[] strings = {"Написать метод,", "который меняет", "массива местами", "два элемента"};
        Fruit[] box = {new Apple(), new Orange(), new Orange(), new Apple()};
        printArray(nums);
        printArray(strings);
        printArray(box);
        changeElements(nums, 1, 4);
        changeElements(strings, 2, 3);
        changeElements(box, 1, 3);
        printArray(nums);
        printArray(strings);
        printArray(box);
    }

    private static void changeElements(Object[] array, int a, int b) {
        Object temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static void printArray(Object[] array) {
        for (Object arr : array) {
            System.out.print(arr + " ");
        }
        System.out.println();
    }
}
