class Solution {
    public String longestPalindrome(String s) {
        
        String ans=String.valueOf(s.charAt(0));
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                   String temp=s.substring(i,j);
                    if(is_palindrome(temp))
                    {
                        if(temp.length()>ans.length())ans=temp;
                    }
            }
        }
        return ans;
    }
    public boolean is_palindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j)) 
            {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
