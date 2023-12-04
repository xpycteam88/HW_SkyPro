package task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Билет №1");
        System.out.println("Массив на входе " + Arrays.toString(arr));
        reverseArray(arr);
        System.out.println("Массив на выходе " + Arrays.toString(arr));
    }
    public static void reverseArray(int[] array) {
        int[] tempArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tempArr[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tempArr[i];
        }
    }
}
