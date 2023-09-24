class Solution {


    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean dp[]= new Boolean[s.length()+1];
        return A(s,0,wordDict,dp);

    }
    public boolean A(String s,int index,List<String>l,Boolean dp[])
    {
        if(index>=s.length())
            return true;
        
        if(dp[index]!=null)return dp[index];
        for(int i=index;i<s.length();i++)
        {
            String temp= s.substring(index,i+1);
            if(l.contains(temp))
            {
                 if(A(s,i+1,l,dp))
                     
                     return dp[index]= true;
            }
        }
        return dp[index]= false;
    }
}
 
