class Solution {
    
    Integer memo[][];
    public int longestCommonSubsequence(String s1, String s2) {
        
        memo= new Integer[s1.length()][s2.length()];
        return A(0,0,s1,s2);
      
    }

    public int A(int i,int j,String s1,String s2)
    {
        if(i>=s1.length()|| j>=s2.length())
        {
            return 0 ;
        }
        if(memo[i][j]!=null) return memo[i][j];
        int a=0,b=0,c=0;
        if(s1.charAt(i)==s2.charAt(j))
        {
           a=1+ A(i+1,j+1,s1,s2);
        }
        b= A(i+1,j,s1,s2);
        c=A(i,j+1,s1,s2);

        return memo[i][j]= Math.max(a,Math.max(b,c));
    }
}
