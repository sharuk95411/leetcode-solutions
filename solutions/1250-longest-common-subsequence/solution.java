class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int x= text1.length();
        int y= text2.length();
         int t[][]= new int[x+1][y+1];
        for(int i=1;i<x+1;i++)
        {
            for(int j=1;j<y+1;j++)
            {
                if(text1.charAt(i-1)==text2.charAt(j-1))
                {
                    t[i][j]= 1+t[i-1][j-1];
                }
                else
                {
                    t[i][j]= Math.max((t[i-1][j]),t[i][j-1]);
                }
            }
        }
        return t[x][y];
    }
}
