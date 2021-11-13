class Solution {
    
    // Logic BY Naresh gupta and isme Each Case me TC b btai h to dekh lena ek bar TC and its very easy and TYN
    Integer dp[][];
    
    public int minimumTotal(List<List<Integer>> list) {
        
       dp = new Integer[list.size()][list.size()];
        return A(list,0,0);
        
    }
    private int A(List<List<Integer>>list,int r,int c)
    {
        if(r>=list.size()) 
        {
            return 0;
        }
        if(dp[r][c]!=null) return dp[r][c];
        return dp[r][c]= Math.min(A(list,r+1,c),A(list,r+1,c+1))+list.get(r).get(c);
        
    }
}
