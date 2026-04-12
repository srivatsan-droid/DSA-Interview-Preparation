package Blind_75.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicateBrute(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateOptimized(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        boolean ans = containsDuplicateBrute(nums);
        System.out.println(ans);
        boolean optimized = containsDuplicateOptimized(nums);
        System.out.println(optimized);
    }
}
