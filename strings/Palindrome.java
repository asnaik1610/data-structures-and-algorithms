package strings;

class Palindrome {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s1 = "";
        if (x == 0)
            return true;
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        if (s1.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}