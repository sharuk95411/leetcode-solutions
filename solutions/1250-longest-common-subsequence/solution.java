class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        int memo[][]= new int[s1.length()][s2.length()];
        for(int i=0;i<memo.length;i++)
        {
            Arrays.fill(memo[i],-1 );
        }
        return A(s1,s2,0,0,memo);
    }
    public int A(String s1,String s2,int i,int j,int memo[][])

    {
        if(i>=s1.length()|| j>=s2.length()) return 0;
         
         if(memo[i][j]!=-1) return memo[i][j];
         int way1=0,way2=0,a=0;
        if(s1.charAt(i)==s2.charAt(j))
        {
             a= 1+A(s1,s2,i+1,j+1,memo);
        }
        else
        {
            way1= A(s1,s2,i+1,j,memo);
            way2= A(s1,s2,i,j+1,memo);
        }

        return memo[i][j]= Math.max(a,Math.max(way1,way2));
    }
}
