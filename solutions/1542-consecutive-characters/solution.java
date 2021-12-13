class Solution {
    public int maxPower(String s) {
        if(s.length()==0) return 0;
        int ans=1;
        int count=1;
        
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                ans= Math.max(ans,count);
                count=1;
            }
        }
        return Math.max(ans,count);
    }
}
