class Solution {

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashMap<Character,Integer>h= new HashMap<>();
        int ans=0;
        int i=0;
        int j=1;
        if(s.charAt(i)==' ')
        {
            h.put('A',1);
        }
       h.put(s.charAt(i),0);

        while(j<s.length())
        { 

            
            char c= s.charAt(j);

            if(h.containsKey(c))
            {
                ans= Math.max(ans,j-i);
                while(s.charAt(i)!=s.charAt(j))
                {
                    h.remove(s.charAt(i));
                    i++;
                }
                h.remove(s.charAt(i));
                i++;   
            }
              h.put(c,1);
                j++;
            
        }
        ans=Math.max(ans,j-i);
        return ans;
    }
}
