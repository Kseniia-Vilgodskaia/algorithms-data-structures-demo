package org.example.algorithms.mergesort;

import java.util.Arrays;

public class MergeSort {
    public static int[] merge(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j] || array1[i] == array2[j]) {
                mergedArray[index] = array1[i];
                i++;
            } else {
                mergedArray[index] = array2[j];
                j++;
            }
            index++;
        }
        while (i < array1.length) {
            mergedArray[index] = array1[i];
            index++;
            i++;
        }

        while (j < array2.length) {
            mergedArray[index] = array2[j];
            index++;
            j++;
        }
        return mergedArray;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;

        int medIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, medIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, medIndex, array.length));

        return merge(left, right);
    }


    public static void main(String[] args) {
        int[] unsortedArray = {3, 2, 6, 9, 1, 7, 5};
        System.out.println(Arrays.toString(mergeSort(unsortedArray)));
    }
}
