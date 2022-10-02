class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int mod = (int) (1e9 + 7);
        int[][] dp = new int[n][target + 1];
        
        for (int sum = 1; sum <= k && sum <= target; sum++)
            dp[n - 1][sum] = 1;

        while (--n > 0) {
            int sum = 0;
            while (++sum <= target) {
                if (dp[n][sum] == 0)
                    continue;
                
                int ksum = 0;
                while ((sum + ++ksum) <= target && ksum <= k)
                    dp[n - 1][sum + ksum] = (dp[n - 1][sum + ksum] + dp[n][sum]) % mod;
            }
        }        
        
        // for (int[] x : dp) {
        //     for (int y : x) 
        //         System.out.print(y + " ");
        //     System.out.println();
        // }
        
        return dp[0][target];
    }
}
