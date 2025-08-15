package arrays.Java;

public class MoveZeroesToEnd {
    void pushZerosToEnd(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        // 1st approach -> 1110/1115
        // if(arr.length <= 1) return;
        // outer: for(int i=0; i<arr.length; i++){
        // if(arr[i] == 0){
        // inner: for(int j=i+1; j<arr.length; j++){
        // if(arr[j] != 0){
        // int temp = arr[j];
        // arr[j] = arr[i];
        // arr[i] = temp;
        // if(j==(arr.length-1)) break outer;
        // break inner;
        // }
        // }
        // }
        // }

    }
}