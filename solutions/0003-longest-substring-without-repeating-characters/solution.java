class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0) return 0;
        HashMap<Character,Integer>h= new HashMap<>();
     int start=0;
     int end=1;
     int ans= end-start;
     h.put(s.charAt(start),0);

         while(end<s.length())
         {
            char c= s.charAt(end);
            if(h.containsKey(c) && start<=h.get(c))
            {
                 
                 int tempAns= end-start;
                 start=h.get(c)+1;
                ans= Math.max(ans,tempAns);
                h.put(c,end);
            }
            else
            h.put(c,end);
            end++;
         }
         int a= end-start;

         ans= Math.max(ans,a);
         return ans;
    }
}
