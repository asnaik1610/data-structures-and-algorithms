package arrays.Java;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int max = 0;
        int max2 = 0;
        for (int i : arr) {
            if (i > max) {
                max2 = max;
                max = i;
            }
            if (max2 < i && i < max) {
                max2 = i;
            }
        }
        if (max2 > 0)
            return max2;
        else
            return -1;
    }
}
