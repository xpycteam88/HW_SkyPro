package task3;
import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] invertArr = invertArray(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(invertArr));
    }
    public static int[] invertArray(int[] array) {
        int[] tempArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            tempArr[array.length - 1 - i] = array[i];
        }

        return tempArr;
    }
}
