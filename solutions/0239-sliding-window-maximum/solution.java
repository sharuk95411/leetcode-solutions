class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Step 1: Remove elements from back smaller than current value
            while (!dq.isEmpty() && dq.peekLast() < nums[i]) {
                dq.pollLast();
            }

            // Step 2: Add current value
            dq.offerLast(nums[i]);

            // Step 3: Remove element that’s now out of window from the front
            // ONLY if it's equal to nums[i - k]
            if (i >= k && dq.peekFirst() == nums[i - k]) {
                dq.pollFirst();
            }

            // Step 4: Store the max in result (front of deque)
            if (i >= k - 1) {
                res[i - k + 1] = dq.peekFirst();
            }
        }

        return res;
    }
}

