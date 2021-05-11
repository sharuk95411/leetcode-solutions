class Solution {
    public int leastInterval(char[] c, int n) {
          HashMap<Character,Integer>h= new HashMap<>();
        for(int i=0;i<c.length;i++)
        {
            if(h.get(c[i])!=null)
            {
                h.put(c[i],h.get(c[i])+1);
            }
            else
            {
                h.put(c[i],1);
            }
        }
        
     PriorityQueue<Integer>pq= new PriorityQueue<>(h.size(), Collections.reverseOrder());/* yha h,size likhne 
         se values kse max head me save ho jygi ye smjh ni aya h pr ye chz bht achi h */
         pq.addAll(h.values()); 
         int time=0;
         
    while(pq.size()>0)
    {
        
        List<Integer>list= new ArrayList<>();
        int idle=n+1;
        while(idle>0 &&pq.size()>0)
        {
            int f=pq.poll();
            if(f>1) list.add(f-1);
            idle--;
            
            
        }
        if(list.isEmpty()==true)/* thats mean all charcter ki sari frequencies use ki ja chuki h and sabki ab
        freq 0 ho chuki h */
        {
            time= time+n+1-idle;
            
        }
        else
        {
            time=time+n+1;
        }
        pq.addAll(list);
        
        }
       return time; 
    }
}
