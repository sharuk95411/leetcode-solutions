class Solution {
    public int lengthOfLongestSubstring(String s) {
    
    int i=0;
    int j=0;
    int ans=0;
    HashMap<Character,Integer>h= new HashMap<>();
    int window_size=0;

    while(j<s.length())
    {
        char c= s.charAt(j);
        if(h.containsKey(c)==false)
        {
            h.put(c,1);
            window_size= j-i+1;
            j++;
        }
        else
        {
            h.remove(s.charAt(i));
            i++;
            ans= Math.max(window_size,ans);
        }
    }
    ans= Math.max(window_size,ans);
    return ans;
    }
}
