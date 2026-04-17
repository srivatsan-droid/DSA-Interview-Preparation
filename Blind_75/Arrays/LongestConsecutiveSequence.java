package Blind_75.Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestSequenceOptimized(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int longest = 0;
        for(int num : set) {
            int current = num;
            int count = 1;
            while(set.contains(current + 1)) {
                current++;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,1,2};
        int ans = longestSequenceOptimized(nums);
        System.out.println(ans);
    }
}
