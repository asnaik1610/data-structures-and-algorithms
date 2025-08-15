package strings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {
        // initializing count variable to check the no of words of "s" with the length
        // of "pattern"
        int count = 0;
        boolean res = false;
        Map<String, String> my_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
        count++;
        if (count == pattern.length()) {
            String temp = "";
            int i = 0;
            int j = 0;
            int c = 0;

            loop: while (i < s.length()) {
                if (s.charAt(i) == ' ') {
                    if (!my_map.containsKey(Character.toString(pattern.charAt(j))) && my_map.containsValue(temp)) {
                        my_map.put(Character.toString(pattern.charAt(j)), temp);
                        c++;
                    } else {
                        if (temp.equals(my_map.get(Character.toString(pattern.charAt(j))))) {
                            res = true;
                            System.out.println("hi");
                        } else {
                            res = false;
                            break loop;
                        }
                    }
                    temp = "";
                    j++;
                } else {
                    temp += Character.toString(s.charAt(i));
                }
                i++;
                if (i == s.length()) {
                    if (!my_map.containsKey(Character.toString(pattern.charAt(j))) && !my_map.containsValue(temp)) {
                        my_map.put(Character.toString(pattern.charAt(j)), temp);
                        c++;
                        if (c == pattern.length()) {
                            res = true;
                            break loop;
                        }
                    } else {
                        if (temp.equals(my_map.get(Character.toString(pattern.charAt(j))))) {
                            res = true;
                        } else
                            res = false;
                    }
                }
            }
        } else
            res = false;
        return res;
    }
}
