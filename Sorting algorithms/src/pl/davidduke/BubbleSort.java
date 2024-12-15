package pl.davidduke;

import java.util.Arrays;

public class BubbleSort {
    private BubbleSort() {
        //private constructor
    }

    public static void sort(int[] arr) {
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
