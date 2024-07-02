class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int ans=1;
        int count=1;
        String temp=s.charAt(0)+"";
        
        int i=1;
        
        while(i<s.length())
        {
            String c=s.charAt(i)+"";
            if(temp.contains(c))
            {
                ans=Math.max(ans,count);
                int index= temp.indexOf(c);
                count =temp.length()-index-1;
                count++;
                temp=temp.substring(index+1)+c;
                
            }
            else
            {
                temp=temp+c;
               count++;
                
            }
            // System.out.println("COUNT "+count);
            i++;
        }
        return Math.max(count,ans);
    }
}
