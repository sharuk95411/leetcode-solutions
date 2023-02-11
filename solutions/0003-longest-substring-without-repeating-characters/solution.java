class Solution {
    public int lengthOfLongestSubstring(String s) {
          int ans=0;
        List<Character>list= new ArrayList<>();
         for(int i=0;i<s.length();i++)
         {
             for(int j=i;j<s.length();j++)
             {
                 char c= s.charAt(j);
                 if(list.contains(c)==false)
                 {
                       list.add(c);
                 }
                 else break;
             }
             ans= Math.max(ans,list.size());
             list= new ArrayList<>();
             
         }
         return ans;
	   }
}
