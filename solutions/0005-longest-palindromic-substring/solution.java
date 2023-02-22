class Solution {
    public String longestPalindrome(String s) {
        String ans=String.valueOf(s.charAt(0));
        for(int i=0;i<s.length();i++)
        {
            int odd=  expand(s,i,i);
            // System.out.println("length is "+odd);
            int even=  expand(s,i,i+1);
            int decide= Math.max(odd,even);

            System.out.println("Even Odd === "+even+" And "+odd);
            if(ans.length()<decide)
            {
                int l= i-(decide-1)/2;
                int r= i+decide/2;
                ans= s.substring(l,r+1);
            }
        }
        return ans;
    }
    public int expand(String s,int left,int right)
    {
       while(left>=0 && right <s.length() && s.charAt(left)==s.charAt(right))
       {
           left--;
           right++;
       }
       return right-left-1;
    }
}
