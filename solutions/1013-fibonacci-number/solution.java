class Solution {
    
    Integer dp[];
    public int fib(int n) {
        if(n<=1) return n; 
       
        dp= new Integer[n+1];
        
        return A(dp,n);
        
    }
    private int A(Integer dp[],int n)
    {
        if(n<=1) return n;
        if(dp[n]!=null) return dp[n];
        dp[n]= A(dp,n-1)+A(dp,n-2);
        return dp[n];
    }
}
