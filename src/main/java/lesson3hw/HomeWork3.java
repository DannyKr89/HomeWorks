package lesson3hw;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        invertArray();

        System.out.println("Задание №2");
        newArray100();

        System.out.println("Задание №3");
        arrayX2LessSix();

        System.out.println("Задание №4");
        quadArray();

        System.out.println("Задание №5");
        System.out.println(Arrays.toString(arrayInitValue(40, 12)));
        System.out.println();

        System.out.println("Задание №6");
        arrMinMax();

        System.out.println("Задание №7");
        System.out.println(arrayBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));
        System.out.println();

        System.out.println("Задание №8");
        moveArray(new int[]{3, 5, 6, 1}, -614);
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1};
        System.out.println(Arrays.toString(arr) + " - нормальный массив");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr) + " - инвертированный массив");
        System.out.println();
    }


    private static void newArray100() {
        int[] newArr = new int[100];
        int n = 1;
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = n++;
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println();
    }

    private static void arrayX2LessSix() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    private static void quadArray() {
        int[][] a = new int[10][10];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][a[j].length - (i + 1)] = 1;
                if (j == i) {
                    a[i][j] = 1;
                    System.out.println(Arrays.toString(a[j]));
                }
            }
        }
        System.out.println();
    }


    private static int[] arrayInitValue(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array,initialValue);
        return array;
    }

    private static void arrMinMax() {
        int[] a = {140, 56, 430, 78, 13, -32, 45};
        System.out.println(Arrays.toString(a));
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Максимальное число " + max);
        System.out.println("Минимальное число " + min);
        System.out.println();
    }

    private static boolean arrayBalance(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int lSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            lSum += arr[i];
            int rSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rSum += arr[j];
            }
            if (lSum == rSum) {
                System.out.printf("На %d элементе массива сумма левой и правой части = %d! ", i + 1, lSum);
                System.out.println();
                return true;
            }
        }
        System.out.println("Левая и правая части не равны");
        return false;
    }

    public static int[] moveArray(int[] arr, int n) {
        System.out.println("Массив " + Arrays.toString(arr) + " cмеcтить элементы на " + n + " позиций");
        n = n % arr.length;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                int num = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = num;
            }
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 0; i > n; i--) {
                int num = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = num;
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}

