class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String>ans= new ArrayList<>();
        if(wordDict.contains(s))
           ans.add(s);
        
        for(int i=1;i<=s.length();i++)
        {
            String left= s.substring(0,i);
            if(wordDict.contains(left))
            {
                List<String>sublist= wordBreak(s.substring(i),wordDict);
                
                    for(String str: sublist)
                    {
                        ans.add(left+" "+str);
                    }
            }
        }
        return ans;
    }
}
