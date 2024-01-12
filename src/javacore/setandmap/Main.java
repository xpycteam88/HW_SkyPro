package javacore.setandmap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Listservice listservice = new Listservice();
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println(nums);
        listservice.task1(nums);
        listservice.task2(nums);
        listservice.task3(strings);
        listservice.task4(strings);
    }
}
