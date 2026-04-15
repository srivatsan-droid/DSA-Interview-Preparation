package Blind_75.Arrays;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static int[] topKFrequentElements(int nums[], int k) {
        int result[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {
            queue.add(num); // Add the unique number
            if (queue.size() > k) {
                queue.poll(); // Remove the number with the LOWEST frequency
            }
        }
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int result[] = topKFrequentElements(nums, k);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
