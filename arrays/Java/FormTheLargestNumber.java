package arrays.Java;

import java.util.Arrays;

public class FormTheLargestNumber {
    public String findLargest(int[] arr) {

        // based on Sorting/Greedy
        String[] newArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = String.valueOf(arr[i]); // populate newArr with string representations of arr elements
        }

        // String.compareTo doesn’t compare numeric value; it compares like a dictionary
        Arrays.sort(newArr, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is 0, we return "0" -> edge case
        if (newArr[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : newArr) {
            sb.append(s);
        }

        return sb.toString();

        // 1st approach
        // problem -> doesn't compare the numbers pairwise, also parseLong will break
        // for large numbers
        // learning -> a comparator is just a universal rule that, given any two
        // elements, decides which one should come before the other in the final order.
        // String res = String.valueOf(arr[0]);
        // for(int i=1; i<arr.length; i++){
        // String addedLeft = String.valueOf(arr[i]) + res;
        // String addedRight = res + String.valueOf(arr[i]);
        // if(Long.parseLong(addedRight) > Long.parseLong(addedLeft)){
        // res = addedRight;
        // } else {
        // res = addedLeft;
        // }
        // }
        // return res;
    }
}
