package strings;

class roman_to_int {
    public int romanToInt(String s) {
        int sum = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'I') {
                sum += 1;
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'V') {
                        sum += 3;
                        i += 1;
                    }
                    if (s.charAt(i + 1) == 'X') {
                        sum += 8;
                        i += 1;
                    }
                    i += 1;
                }
            }
            if (s.charAt(i) == 'X') {
                sum += 10;
                i += 1;
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'L') {
                        sum += 30;
                        i += 1;
                    }
                    if (s.charAt(i + 1) == 'C') {
                        sum += 80;
                        i += 1;
                    }
                    i += 1;
                }
            }
            if (s.charAt(i) == 'C') {
                sum += 100;
                i += 1;
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'D') {
                        sum += 300;
                        i += 1;
                    }
                    if (s.charAt(i + 1) == 'M') {
                        sum += 800;
                        i += 1;
                    }
                    i += 1;
                }
            }
            if (s.charAt(i) == 'V') {
                sum += 5;
                i += 1;
            }
            if (s.charAt(i) == 'L') {
                sum += 50;
                i += 1;
            }
            if (s.charAt(i) == 'D') {
                sum += 500;
                i += 1;
            }
            if (s.charAt(i) == 'M') {
                sum += 1000;
                i += 1;
            }
        }
        return sum;
    }
}
