class Solution {
    public int longestPalindromeSubseq(String str1) {
         StringBuilder sb= new StringBuilder(str1);
        String str2= sb.reverse().toString();
        int n= str1.length();
	    int m= str2.length();
	    int t[][]= new int[n+1][m+1];
	    
	    for(int i=1;i<n+1;i++)
	    {
	        for(int j=1;j<m+1;j++)
	        {
	           if(str1.charAt(i-1)==str2.charAt(j-1))
	           {
	               t[i][j]= 1+t[i-1][j-1];
	           }
	           else
	           t[i][j]= Math.max(t[i-1][j],t[i][j-1] );
	            
	        }
	    }
	    return t[n][m];
    }
}
