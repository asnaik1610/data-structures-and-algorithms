package strings;

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        boolean flag = false;
        int j = 0;
        int i = 0;

        if (s.length() == 0) {
            flag = true;
        }

        while (j < t.length() && i < s.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;

            if (i == s.length()) {
                flag = true;
            }
        }
        return flag;
    }
}
