package Blind_75.Arrays;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSumbrute(int nums[], int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] twoSumOptimized(int nums[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sum = target - nums[i];
            if (map.containsKey(sum)) {
                return new int[] { map.get(sum), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int nums[] = { 2, 2, 3 };
        int target = 5;
        int ansBrute[] = twoSumbrute(nums, target);
        for (int i = 0; i < ansBrute.length; i++) {
            System.out.println(ansBrute[i] + " ");
        }
        int ansOptimized[] = twoSumOptimized(nums, target);
        for (int i = 0; i < ansOptimized.length; i++) {
            System.out.println(ansOptimized[i] + " ");
        }
    }
}
