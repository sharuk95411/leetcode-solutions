class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
      HashMap<Character,Integer>h = new HashMap<>();
      int start=0;
      int end=0;
      int ans=0;
      int i=0;
      boolean b=true;
      for(i=0;i<s.length();i++)
      {
          char c= s.charAt(i);
          if(h.containsKey(c))
          {
              ans= Math.max(ans,end-start);
              if(h.get(c)>=start)
              {
                start=h.get(c);
              }
              end=i;
             
              h.put(c,i);
          }
          else
          { 
              end++;
              h.put(c,i);
          }
      }
    //   if(b)
      ans= Math.max(ans,end-start);
      return ans;
}
}
