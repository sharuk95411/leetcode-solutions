class Solution {
    public String longestPalindrome(String s) {
        
         int n= s.length();
        int maxLength=1;
        int start=0,high=0,low=0;
        for(int i=1;i<n;i++)
        { 
            // when the length of palindromic substring is even
             low=i-1;
            high= i;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high) )
            {
                if((high-low+1)>maxLength)
                {
                    start=low;
                    maxLength= high-low+1;
                }
                low--;
                high++;
            }
           // when the length of palindromic substring is odd
            low=i-1;
            high= i+1;
            while(low>=0 && high<n && s.charAt(low)==s.charAt(high) )
            {
                if((high-low+1)>maxLength)
                {
                    start=low;
                    maxLength= high-low+1;
                }
                low--;
                high++;
            }
        }
        return (s.substring(start,start+maxLength));
    
    }
}
