class Solution {
    public int coinChange(int[] arr, int sum) {
        if (sum == 0) return 0;
        Arrays.sort(arr); // Optional sorting for efficiency
        int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1); // Initialize the memoization array with -1
        int result = helper(arr, sum, dp);
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    private int helper(int[] arr, int sum, int[] dp) {
        if (sum < 0) return Integer.MAX_VALUE; // Invalid case
        if (sum == 0) return 0; // Base case
        if (dp[sum] != -1) return dp[sum]; // Return cached result if available

        int minCount = Integer.MAX_VALUE;
        for (int coin : arr) {
            int res = helper(arr, sum - coin, dp);
            if (res != Integer.MAX_VALUE) {
                minCount = Math.min(minCount, res + 1); // Add 1 for the current coin
            }
        }

        dp[sum] = minCount; // Store the result in the memoization array
        return dp[sum];
    }
}

