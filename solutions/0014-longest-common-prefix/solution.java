class Solution {
    public String longestCommonPrefix(String[] s) {
        
    if(s.length==0) return "";
        
        String ans=s[0];
        String str="";
        
        
        for(int i=1;i<s.length;i++)
        {
            String temp= s[i];
            int m=0,n=0;
            while(m<ans.length()&& n<temp.length())
            {
                if(ans.charAt(m)==temp.charAt(n))
                {
                   str= str+ans.charAt(m);
                    m++;
                    n++;
                }
                else break;
            }
            ans= str;
            str="";
        }
         return ans;
    }
}
