package arrays.Java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> my_map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!my_map.containsKey((Integer) nums[i])) {
                my_map.put((Integer) nums[i], 1);
            } else {
                Integer val = my_map.get((Integer) nums[i]) + 1;
                my_map.put((Integer) nums[i], val);
            }
        }
        System.out.println(my_map);
        int res = 0;
        int maxValueInMap = (Collections.max(my_map.values()));
        for (Entry<Integer, Integer> entry : my_map.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                res = entry.getKey();
            }
        }
        return res;
    }
}
