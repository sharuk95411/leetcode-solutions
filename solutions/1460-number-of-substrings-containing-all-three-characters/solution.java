class Solution {
    public int numberOfSubstrings(String s) {
        
        HashMap<Character,Integer>h= new HashMap<>();
        for(int i=0;i<2;i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        int end=s.length();
        int ans=0;
        int left=0;
        int right=2;
        while(right<s.length())
        {
            h.put(s.charAt(right),h.getOrDefault(s.charAt(right),0)+1);
            while(h.size()==3)
            {
                ans=ans+end-right;
                h.put(s.charAt(left),h.get(s.charAt(left))-1);
                if(h.get(s.charAt(left))==0)
                {
                   h.remove(s.charAt(left++));
                   // left++;
                   break;
                }
                left++;
            }
            right++; 
        }
        return ans;
    }
}
