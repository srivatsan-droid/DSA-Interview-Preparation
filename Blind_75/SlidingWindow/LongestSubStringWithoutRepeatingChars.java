package Blind_75.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public static int longestSubStringOptimized(String s) {
        //Set to be initialized to keep a track of no Repetition
        Set<Character> set = new HashSet<>();
        //Initialize Left Pointer to be at index 0
        int left = 0;
        //find the MaxLen and keep updating as the set encounters new Characters
        int maxLen = 0;
        for(int right = 0;right < s.length();right++) {
            //If the Set already the Character at the right say initially it will be at index 0 so nothing it skips this part this condition is for duplicate characters
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        int ans = longestSubStringOptimized(s);
        System.out.println(ans);
    }
}
