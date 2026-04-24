package Blind_75.Binary_Search;

public class SearchInRotatedSortedArray {
    public static int searchBrute(int nums[],int target) {
        int n = nums.length;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int searchOptimized(int nums[],int target) {
        int left = 0,right = nums.length-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[left] <= nums[mid]) {
                if(target >= nums[left] && target <= nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if(nums[right] <= nums[mid]) {
                    if(target >= nums[mid] && target <= nums[right]) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int ans = searchOptimized(nums,target);
        System.out.println(ans);
    }
}
