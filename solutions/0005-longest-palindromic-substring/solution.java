
class Solution {
    String ans="";
    public String longestPalindrome(String s) {
     
      for(int i=0;i<s.length();i++)
      {
                Expend(i-1,i+1,s);
                Expend(i,i+1,s);    
      }
      return ans;

    }
    public void Expend(int left,int right,String s)
    {
        while(left>=0 && right<s.length())
        {
            if(s.charAt(left)!=s.charAt(right)) break;
                left--;
                right++;
        }
        
        s= s.substring(left+1,right);
        if(s.length()>ans.length())
         ans=s;
    }
}
