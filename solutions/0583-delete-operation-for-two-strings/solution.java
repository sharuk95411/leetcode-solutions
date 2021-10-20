class Solution {
    public int minDistance(String s1, String s2) {
        
	     int x= s1.length();
        int y= s2.length();
        
        
        int dp[][]= new int[x+1][y+1];
        
        for(int i=1;i<x+1;i++)
        {
            for(int j=1;j<y+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]= 1+dp[i-1][j-1];
                    
                }
                else
                {
                    dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int l =dp[x][y];
       // System.out.println(l);
        return ((x+y)-2*l);
    }
}
