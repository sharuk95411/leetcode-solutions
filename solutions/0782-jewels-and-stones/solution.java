class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        HashMap<Character,Integer>h= new HashMap<>();

        for(int i=0;i<stones.length();i++)
        {
            char c = stones.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(int i=0;i<jewels.length();i++)
        {
            char c= jewels.charAt(i);
            if(h.get(c)!=null)
            {
                ans= ans+h.get(c);
            }
        }
        return ans;
    }
}
