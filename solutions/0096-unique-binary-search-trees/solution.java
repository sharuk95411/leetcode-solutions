class Solution {
     public int numTrees(int n) {
         int dp[][] =new int[n+1][n+1];
        return numTrees(1, n,dp);
    }
    
    private int numTrees(int start, int end,int dp[][]) {
        
        if (start >= end) {
            return 1;
        }     
        if(dp[start][end]!=0 )return dp[start][end];
        int countUnique = 0;        
        for (int i = start; i <= end; i++) { // take i as root
            countUnique += numTrees(start, i - 1,dp) * numTrees(i + 1, end,dp);
            dp[start][end]=countUnique;
        }        
        return dp[start][end];
    }
}
