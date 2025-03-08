class Solution {
    String ans="";
    public String longestPalindrome(String s) {
        if(s.length()==1) return s;
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
            if(s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            else break;
        }
        
        int size= right-left-1;
        if(size>ans.length())
        ans=s.substring(left+1,right);
    }
}
