package arrays.Java;

public class ReverseArray {
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int temp = arr.length / 2;
        while (temp > 0) {
            int temp2 = arr[start];
            arr[start] = arr[end];
            arr[end] = temp2;
            start++;
            end--;
            temp--;
        }
    }
}
