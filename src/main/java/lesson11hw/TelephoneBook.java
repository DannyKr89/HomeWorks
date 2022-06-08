package lesson11hw;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    private static Map<String,String> phoneBookMap = new HashMap<>();

    public static void main(String[] args) {
        addNumber("Dan", "798234823");
        addNumber("Ben", "236467347");
        addNumber("Valera", "82346348");
        addNumber("Dan", "672384763");
        addNumber("Dan", "2637523");
        addNumber("Bill", "623746");
        addNumber("Tod", "1763443");
        addNumber("Tod", "763235");
        addNumber("Mat", "92342221");
        
        System.out.println(phoneBookMap);

        getNumber("Dan");
        getNumber("Tod");
        getNumber("Mat");
    }

    private static void getNumber(String name) {
        System.out.println(name + "\t" + phoneBookMap.get(name));
    }

    private static void addNumber(String name, String phoneNumber) {
        if (phoneBookMap.containsKey(name)){
            phoneBookMap.put(name,phoneBookMap.get(name) + ", " + phoneNumber);
        }
        else {
            phoneBookMap.put(name, phoneNumber);
        }
    }
}
