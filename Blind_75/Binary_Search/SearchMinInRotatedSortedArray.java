package Blind_75.Binary_Search;

public class SearchMinInRotatedSortedArray {
    public static int minBrute(int nums[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }
    public static int minOptimized(int nums[]) {
        int low = 0,high = nums.length-1;
        while(low < high) {
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]) {
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        int nums[] = {3,4,5,1,2};
        int ans = minOptimized(nums);
        System.out.println(ans);
    }
}
