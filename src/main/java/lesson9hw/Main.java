package lesson9hw;

import org.junit.function.ThrowingRunnable;

public class Main {
    public static void main(String[] args) {
        String[][] myArray1 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] myArray2 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        String[][] myArray3 = new String[][]{
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16s"}
        };

        myArrayException(myArray1);
        myArrayException(myArray2);
        myArrayException(myArray3);

    }

    public static int myArrayException(String[][] myArray) {
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray.length != 4 || myArray[i].length != 4) {
                throw myArraySizeException();

            }
            for (int j = 0; j < myArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    System.err.printf("В ячейке под номером %d x %d находятся неверные данные!\n", i + 1, j + 1);
                    throw myArrayDataException();

                }
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static RuntimeException myArrayDataException() {
        return new RuntimeException("В массиве обнаружен символ или строка");
    }

    public static RuntimeException myArraySizeException() {
        return new RuntimeException("Массив не 4х4");
    }
}
