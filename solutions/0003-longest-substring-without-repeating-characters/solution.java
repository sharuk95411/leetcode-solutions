class Solution {
    public int lengthOfLongestSubstring(String s) {
               int i=0,j=0;
        int ans=0;
        HashMap<Character,Integer>h= new HashMap<>();
        for( i=0;i<s.length();i++)
        {
         h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
         if(h.get(s.charAt(i))==2)
         {
             while(j<i)
             {
                 char ch=s.charAt(j);
                 h.put(ch,h.get(ch)-1);
                 j++;
                if(h.get(ch)==1)
                {
                    break;
                }
                
             }
             
         }
         else
         {
         int length= i+1-j;
         if(length>ans) ans= length;
         }
         
        }
        return ans;
    }
}
