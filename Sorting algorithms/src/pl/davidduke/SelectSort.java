package pl.davidduke;

import java.util.Arrays;

public class SelectSort {
    private SelectSort() {
        //private constructor
    }

    public static void sort(int[] arr) {
        System.out.println("Select sorting:");
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }
}
