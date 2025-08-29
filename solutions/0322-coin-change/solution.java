import java.util.*;

class Solution {

    public int coinChange(int[] arr, int amount) {
        int[][] memo = new int[amount + 1][arr.length];
        for (int i = 0; i <= amount; i++) {
            Arrays.fill(memo[i], -1);
        }

        int ans = solve(arr, amount, 0, memo);
        return ans >= 1e9 ? -1 : ans;
    }

    private int solve(int[] arr, int sum, int i, int[][] memo) {
        if (sum == 0) return 0;
        if (sum < 0 || i >= arr.length) return (int)1e9;

        if (memo[sum][i] != -1) return memo[sum][i];

        // Choice 1: Take current coin (stay at same index because coins are unlimited)
        int take = 1 + solve(arr, sum - arr[i], i, memo);

        // Choice 2: Skip current coin, move to next index
        int skip = solve(arr, sum, i + 1, memo);

        return memo[sum][i] = Math.min(take, skip);
    }
}

