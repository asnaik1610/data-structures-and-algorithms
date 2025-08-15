package strings;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean flag = false;
        int c = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazine.contains(Character.toString(ransomNote.charAt(i)))) {
                magazine = magazine.replaceFirst(Character.toString(ransomNote.charAt(i)), "");
                c++;
            }
        }
        if (c == ransomNote.length()) {
            flag = true;
        }
        return flag;
    }
}
