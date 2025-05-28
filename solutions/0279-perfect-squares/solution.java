import java.util.Arrays;

class Solution {
    
    int[] memo;

    public int numSquares(int n) {
        memo = new int[n + 1];
        Arrays.fill(memo, -1); // -1 means not computed yet
        return A(n);
    }

    public int A(int n) {
        if (n == 0) return 0;

        if (memo[n] != -1) return memo[n]; // use memoized value

        int min = Integer.MAX_VALUE;

        for (int i = 1; i * i <= n; i++) {
            int res = 1 + A(n - i * i);
            min = Math.min(res, min);
        }

        memo[n] = min; // store result
        return min;
    }
}

