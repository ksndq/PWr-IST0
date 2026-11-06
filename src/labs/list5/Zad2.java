package labs.list5;

import java.util.Arrays;

public class Zad2 {

    public static void main(String[] args) {
        int[] data = {45, 12, 85, 32, 8, 90, 23, 11};

        System.out.println("Nieposortowana: " + Arrays.toString(data));
        System.out.println("Posortowana: " + Arrays.toString(bubbleSort(data)));

        System.out.println("Nieposortowana: " + Arrays.toString(data));
        System.out.println("Posortowana malejąco: " + Arrays.toString(bubbleSort(data, true)));
    }

    public static int[] bubbleSort(int[] array) {
        return bubbleSort(array, false);
    }

    public static int[] bubbleSort(int[] array, boolean reversed) {
        int[] result = array.clone();

        for (int i = 0; i < result.length; i++) {
            boolean changed = false;
            for (int j = 0; j < result.length - i - 1; j++) {
                boolean shouldSwap = reversed ? (result[j] < result[j + 1]) : (result[j] > result[j + 1]);
                if (shouldSwap) {
                    changed = true;
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                    System.out.println(Arrays.toString(result));
                }
            }
            if (!changed) break;
        }
        return result;
    }
}
