class Solution {
    public int titleToNumber(String s) {
     
        int mul=26;
        int ans=0;
        int i=0;
       for(i=0;i<s.length()-1;i++)
       {
           int value= s.charAt(i)-'A'+1;
           ans=(ans+value)*mul;
       }
         
        return( ans+s.charAt(i)-'A'+1);
        
    }
}
