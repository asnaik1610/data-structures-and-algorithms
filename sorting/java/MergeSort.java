package sorting.java;

import java.util.Arrays;
import arrays.java.MergeTwoSortedArrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr) { // using recursion

        // base condition
        if (arr.length == 1) {
            return arr;
        }

        // get the middle index
        int mid = arr.length / 2;

        // creating new objects
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return MergeTwoSortedArrays.merge(left, right);
    }
}
