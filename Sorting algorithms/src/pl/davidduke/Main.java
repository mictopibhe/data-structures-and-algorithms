package pl.davidduke;

import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        BubbleSort.sort(createRandomArray(10));
        SelectSort.sort(createRandomArray(10));
    }

    public static int[] createRandomArray(long size) {
        return RANDOM.ints(size).toArray();
    }
}

