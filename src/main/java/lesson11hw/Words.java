package lesson11hw;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("Bye");
        arr.add("Geek");
        arr.add("Brains");
        arr.add("Table");
        arr.add("Sea");
        arr.add("Keyboard");
        arr.add("Sea");
        arr.add("Hello");
        arr.add("Goodbye");
        arr.add("Beach");
        arr.add("Umbrella");
        arr.add("Beach");
        arr.add("Hotel");
        arr.add("Sea");
        System.out.println(arr);

        unicElement(arr);
        countElement(arr);
    }

    private static void countElement(ArrayList<String> arr) {
        Iterator<String> iterator = arr.iterator();
        System.out.println();
        System.out.println("Cколько раз встречаются слова:");
        while (iterator.hasNext()) {
            String str = iterator.next();
            int count = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (str.equals(arr.get(i))) {
                    count++;
                }
            }
            System.out.println(str + " встречается " + count + " раз(a)");


        }
    }

    private static void unicElement(ArrayList<String> arr) {
        Iterator<String> iterator = arr.iterator();
        System.out.println();
        System.out.println("Yникальные слова (встречающиеся только 1 раз):");
        while (iterator.hasNext()) {
            String str = iterator.next();
            int count = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (str.equals(arr.get(i))) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(str + " ");
            }
        }
        System.out.println();
    }
}
