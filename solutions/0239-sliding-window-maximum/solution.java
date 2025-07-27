import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Max heap storing indexes, comparator uses nums[i] for max
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);

        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;

        for (int i = 0; i < n; i++) {
            maxHeap.offer(i);

            // Remove top if index is out of window
            while (maxHeap.peek() <= i - k) {
                maxHeap.poll();
            }

            // Start recording results when the first window is ready
            if (i >= k - 1) {
                result[ri++] = nums[maxHeap.peek()];
            }
        }

        return result;
    }
}

