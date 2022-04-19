package lesson2hw;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        firstHomeWork(5, 6);
        System.out.println("Задание №2");
        secondHomeWork(1234);
        System.out.println("Задание №3");
        System.out.println(thirdHomeWork(-20) + "\n");
        System.out.println("Задание №4");
        forthHomeWork("Передаю строку %s раз(a)", 5);
        System.out.println("Задание №5");
        fifthHomeWork(2002);
    }

    private static void firstHomeWork(int a, int b) {
        boolean isTenTwenty;
        if (a + b >= 10 && a + b <= 20) {
            isTenTwenty = true;
            System.out.println(isTenTwenty);
            ;
        } else {
            isTenTwenty = false;
            System.out.println(isTenTwenty);
            ;
        }
        System.out.println();
    }

    private static void secondHomeWork(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отицательное");
        System.out.println();
    }

    private static boolean thirdHomeWork(int i) {
        boolean isNegative;
        if (i >= 0) {
            isNegative = false;
            return isNegative;
        } else {
            isNegative = true;
            return isNegative;
        }
    }

    private static void forthHomeWork(String s, int i) {
        for (int j = i; j > 0; j--) {
            System.out.println(String.format(s,j));
        }
        System.out.println();
    }

    private static void fifthHomeWork(int year) {
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Год не високосный");
        } else {
            System.out.println("Год високосный");
        }
    }
}
