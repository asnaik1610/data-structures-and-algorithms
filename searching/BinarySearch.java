package searching;

public class BinarySearch {

    public static int search(int[] arr, int start, int end, int value) {
        if (start > end)
            return -1; //

        int mid = (start + end) / 2;

        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return search(arr, start, mid - 1, value);
        } else {
            return search(arr, mid + 1, end, value);
        }
    }

}
