package Blind_75.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int count[] = new int[26];
        int size = s.length();
        if (s.length() != t.length())
            return false;
        for (int i = 0; i < size; i++) {
            // From A-Z , a-z we Keep incrementing the Characters for string s say a is
            // present then a - 1
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for (int cnt : count) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = isAnagram(s, t);
        System.out.println(ans);
    }
}
