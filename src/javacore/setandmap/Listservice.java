package javacore.setandmap;

import java.util.*;

public class Listservice {

    public static void task1(List<Integer> number) {
        for (int num : number) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2(List<Integer> number) {
        Integer uniqueNum = Integer.MIN_VALUE;
        for (int num : number) {
            if (num % 2 == 0 && uniqueNum != num) {
                System.out.print(num + " ");
                uniqueNum = num;
            }
        }
        System.out.println();
    }

    public static void task3(List<String> strings) {
        Set<String> words = new HashSet<>(strings);
        System.out.println(words);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> uniqString = new HashMap<>();
        for (String string : strings) {
            if (!uniqString.containsKey(string)) {
                uniqString.put(string, 1);
            } else {
                uniqString.put(string, uniqString.get(string) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : uniqString.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
