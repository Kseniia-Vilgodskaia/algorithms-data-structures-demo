package org.example.algorithms.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            while (i - 1 != -1 && array[i - 1] > array[i]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int[] unsortedArray = {3, 2, 6, 1, 7, 5};
        insertionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
}
