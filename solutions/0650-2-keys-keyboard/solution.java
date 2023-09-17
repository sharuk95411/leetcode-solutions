class Solution {
    public int minSteps(int n) {
        int dp[][]= new int[n+1][n+1];
        return solve(n, 1, 0,dp);
    }
    public int solve(int n, int length, int clipboard,int dp[][]){
        if(length == n)
            return 0;
        if(length > n)
            return Integer.MAX_VALUE/2 ;
        if(dp[length][clipboard]!=0) return dp[length][clipboard];
        int copyAndPaste = Integer.MAX_VALUE , paste = Integer.MAX_VALUE ;
        if(clipboard > 0)
          paste = 1 + solve(n, length + clipboard, clipboard,dp);
        copyAndPaste = 2 + solve(n, length + length, length,dp);
        
        return dp[length][clipboard]=Math.min(copyAndPaste, paste);
    }
}
