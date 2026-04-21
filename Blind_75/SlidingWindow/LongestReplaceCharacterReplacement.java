package Blind_75.SlidingWindow;

public class LongestReplaceCharacterReplacement {

    public static int characterReplacement(String s, int k) {

        int[] freq = new int[26];   // stores frequency of A-Z
        int left = 0;
        int maxFreq = 0;            // most frequent char in current window
        int maxLen = 0;             // final answer

        for (int right = 0; right < s.length(); right++) {

            // Step 1: include current character in window
            char ch = s.charAt(right);
            freq[ch - 'A']++;

            // Step 2: update max frequency
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // Step 3: check if window is invalid
            // if changes needed > k → shrink window
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            // Step 4: update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k)); // Output: 4
    }
}