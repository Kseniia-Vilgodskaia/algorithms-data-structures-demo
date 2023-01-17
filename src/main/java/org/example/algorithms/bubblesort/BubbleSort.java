package org.example.algorithms.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] unsortedArray = {3,2,6,1,7,5};
        bubbleSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
}
