class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        List<Character>list= new ArrayList<>();
        int temp=0;
        int ans=0;
        int i=0;
        for(i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            if(list.contains(c))
            {
                ans= Math.max(ans,list.size());
               
                while(!list.isEmpty()&&list.contains(c))
                {
                    System.out.println("REMOVE "+list.get(temp));
                    list.remove(0);
                    
                }
                list.add(c);
                 System.out.println("SIZE "+list.size());
            }
            else
            {
                list.add(c);

            }
        }
        return Math.max(ans,list.size());
    }
}
