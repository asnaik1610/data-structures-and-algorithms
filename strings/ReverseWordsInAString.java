package strings;

import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {

        // implementing stack data structure
        Stack<String> st = new Stack<>();
        String s = new String("Hi hello there   ");

        // removing the trailing spaces
        s = s.trim();
        String temp = "";
        int c = 0;
        for (int i = 0; i < s.length(); i++) {

            // exception case for last word
            if (i == s.length() - 1) {
                temp = temp + Character.toString(s.charAt(s.length() - 1));
                st.push(temp);
            }

            if (s.charAt(i) == ' ') {
                c++;
                // check that whether is only 1 space
                if (c == 1) {
                    st.push(temp);
                }

                // make temp empty to stack another new word
                temp = "";
            } else {
                // concatenate the string
                temp = temp + Character.toString(s.charAt(i));
                c = 0;
            }
        }

        String res = "";
        while (!st.isEmpty()) {
            res += st.pop() + " ";
        }
        res = res.trim();
        System.out.println(res);
    }
}