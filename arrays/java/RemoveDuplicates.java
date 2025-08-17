package arrays.Java;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int c = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[c - 2]) {
                nums[c] = nums[i];
                for (int t : nums) {
                    System.out.print(t + " ");
                }
                System.out.println();
                c++;
            }
            System.out.println("index: " + i + "," + "c value: " + c);
        }
        return c;
    }
}
