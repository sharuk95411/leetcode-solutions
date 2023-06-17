class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer>h= new HashMap<>();
       int left=0;
       int right=0;
       int end= s.length()-1;
       int ans=0;
       while(right<s.length())
       {
        char c= s.charAt(right);
        h.put(c,h.getOrDefault(c,0)+1);
        while(h.size()==3)
        {
             ans= ans+(1+(end-right));
             char ch= s.charAt(left);
              int freq= h.get(ch);
              if(freq<=1) h.remove(ch);
              else h.put(ch,h.get(ch)-1);
             left++;
        }
        right++;
       }
return ans;
    } 
}
