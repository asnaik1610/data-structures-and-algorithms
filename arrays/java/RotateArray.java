package arrays.Java;

public class RotateArray {

    // exptected apprach -> juggling algorithm/reversal algorithm
    // used reversal algorithm
    // time complexity -> O(n)
    // space complexity -> O(1)

    static void rotateArr(int arr[], int d) {
        if (arr.length == 1 || d == 0)
            return;
        int rotate = d % arr.length;
        reverseArr(arr, 0, rotate - 1);
        reverseArr(arr, rotate, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
    }

    static void reverseArr(int arr[], int begin, int end) {
        while (begin < end) {
            int temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            end--;
            begin++;
        }
    }

    // my approach 1st approach -> 1110/1115 O(n*d)
    // int rotate = d % arr.length;
    // while (rotate > 0) {
    // int temp = 0;
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (i == 0)
    // temp = arr[i];
    // arr[i] = arr[i + 1];
    // }
    // arr[arr.length - 1] = temp;
    // rotate--;
    // }

}
