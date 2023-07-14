class Solution {
    public String reorganizeString(String s) {
        
        HashMap<Character,Integer>h= new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c= s.charAt(i);
            h.put(c,h.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((s1, s2) -> {
            int a = h.get(s1);// return the value
            int b = h.get(s2); // return the value
            
            if(a>b)
            {
                 return -1;
            }
            else if(a<b)
            {
                      return 1;
            }
            else 
           return 0;
              });
   String ans="";
       for (Map.Entry<Character,Integer> m : h.entrySet())
        {
         pq.add(m.getKey());
        }
        while(pq.size()>1)
        {
               char c1=pq.poll();
               char c2=pq.poll();
               ans=ans+c1+c2;
               if(h.get(c1)-1>0) 
               {
                         h.put(c1,h.get(c1)-1);
                         pq.add(c1);
               }
               if(h.get(c2)-1>0)
               {
                    h.put(c2,h.get(c2)-1);
                    pq.add(c2);
               }

        }

        if(pq.size()>0)
        { 
         if(h.get(pq.peek())>1) return "";
        else ans=ans+pq.poll();
        }
       
        return ans;

}
}
