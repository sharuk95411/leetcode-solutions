class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0;
        int l= s.length();
        for(int i=l-1;i>=0;i--)
        {
            if(s.charAt(i)!=' ')
            {
                for(int j=i;j>=0;j--)
                {
                    if(s.charAt(j)==' ') return ans;
                    else ans++;
                    i--;
                }
            }
        }
        return ans;
    }
}
