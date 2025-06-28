class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int ans=0;
        HashMap<Character,Integer>h= new HashMap<>();
        int i=0;
        int j=1;
       h.put(s.charAt(i),0);
        while(j<s.length())
        {
           char c= s.charAt(j);
           if(h.containsKey(c))
           {
                int index= h.get(c);
               if(index>=i)
               {
                   ans=Math.max((j-i),ans);
                   i=index+1;
               }

           }
           h.put(c,j);
           j++;
        }
        ans=Math.max((j-i),ans);
        return ans;
    }
}
