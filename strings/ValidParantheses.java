package strings;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {

            // whenever we encounter an opening tag push it to stack
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else { // else pop top element if the element is equal to the corresponding ending tag
                if (!st.isEmpty() &&
                        ((st.peek() == '{' && s.charAt(i) == '}') || (st.peek() == '[' && s.charAt(i) == ']')
                                || (st.peek() == '(' && s.charAt(i) == ')'))) {
                    st.pop();
                } else
                    return flag;
            }
        }
        if (st.isEmpty()) {
            flag = true;
        }
        return flag;
    }
}
