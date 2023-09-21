class Solution {
    
    public int minimumTotal(List<List<Integer>> outer) {
        
        int n=outer.size();
        Integer dp[][]=new Integer[n][n];
        return A(outer,0,0,dp);
    }
    
    public int A(List<List<Integer>>outer,int i,int j,Integer dp[][])
    {
        if(i==outer.size())
        {
            return 0;
        }
        if(dp[i][j]!=null)return dp[i][j];
        
        int a= outer.get(i).get(j)+A(outer,i+1,j,dp);
        int b= outer.get(i).get(j)+A(outer,i+1,j+1,dp);
        
        return dp[i][j]=Math.min(a,b);
    }
}
