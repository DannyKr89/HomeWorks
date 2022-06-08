package lesson12hw;

import java.util.Arrays;

public class Main {
    public static final int SIZE = 1000000;
    public static final int HALF = SIZE / 2;

    public static void main(String[] args) throws InterruptedException {
        float arr[] = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        methodOne(arr);
        methodTwo(arr);
    }

    private static void methodOne(float[] arr) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2 + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));
    }

    private static void methodTwo(float[] arr) throws InterruptedException {
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2 + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2 + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        t1.join();
        t2.join();
        t1.start();
        t2.start();
        System.arraycopy(a1, 0, arr, 0, HALF);
        System.arraycopy(a2, 0, arr, HALF, HALF);
        System.out.println(System.currentTimeMillis() - a);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(a1));
//        System.out.println(Arrays.toString(a2));
    }
}
