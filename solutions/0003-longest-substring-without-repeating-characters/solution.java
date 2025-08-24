class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()==0) return 0;
        int i=0;
        int j=1;
        int ans=0;

        HashMap<Character,Integer>h= new HashMap<>();
        h.put(s.charAt(0),0);

        while(j<s.length())
        {
            char c= s.charAt(j);
 // h.get(c)>=i ye case niche "abba" case lena smjh aa jyga ise q lia gya h            
            if(h.containsKey(c) && h.get(c)>=i)
            {
               ans=Math.max(ans,j-i);
               i = h.get(c)+1;
            }
              h.put(c,j);
              j++;
        }

        return Math.max(ans,j-i);

    }
}
