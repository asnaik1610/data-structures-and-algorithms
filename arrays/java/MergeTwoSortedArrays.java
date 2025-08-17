package arrays.java;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] sortedArr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                sortedArr[k++] = arr2[j++];
            } else {
                sortedArr[k++] = arr1[i++];
            }
        }
        while (i < arr1.length) {
            sortedArr[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            sortedArr[k++] = arr2[j++];
        }
        return sortedArr;
    }

}
