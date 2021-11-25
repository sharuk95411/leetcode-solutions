class Solution {
    // bht hi pyara and easy question h logic faadcoder se h bht ache trike se question ko kra h mza aa gya h TYN and also uski video dekh lena
    //isko rec and Memoization se hi kia h abhi tk
    public int numDistinct(String s, String t) {
        
        if(s.length()<t.length()) return 0;
        if(s.equals(t)) return 1;
        
        Integer dp[][]= new Integer[s.length()+1][t.length()+1];
         return A(s,t,0,0,dp);
    }
    private int A(String s,String t,int i,int j,Integer dp[][])
    {
      
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        
          if(dp[i][j]!=null) return dp[i][j];
       
        
        if(s.charAt(i)!=t.charAt(j))
        {
            return dp[i][j]= A(s,t,i+1,j,dp);
        }
        else
        {
            return dp[i][j]= A(s,t,i+1,j+1,dp) + A(s,t,i+1,j,dp);
        }
    }
}
