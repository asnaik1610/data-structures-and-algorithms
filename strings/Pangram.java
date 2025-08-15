package strings;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String main = "abcdefghijklmnopqrstuvwxyz";
        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;
        String s = sc.nextLine();
        if (N < 26) {
            System.out.println("NO");
        } else {
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++)
                if (main.contains(Character.toString(s.charAt(i)))) {
                    main = main.replace(Character.toString(s.charAt(i)), "");
                    count++;
                } else
                    continue;
            if (count == 26) {
                System.out.println("YES");
            } else
                System.out.println("NO");
        }
    }

}
