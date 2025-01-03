class Solution {
    public int leastInterval(char[] tasks, int n) {
    
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
         int counter[]=new int[26];
        for (char task : tasks) {
            counter[task - 'A']++;
        }
        for (int i = 0; i < 26; i++) {
            if (counter[i]>0) {
                pq.add(counter[i]);
            }
        }
        
        int ans=0;
        
        while(pq.size()>0)
        {
            List<Integer>list= new ArrayList<>();
            
            int time=0;
            for(int i=0;i<n+1;i++)
            {
                if(pq.size()>0)
                {
                    list.add(pq.poll()-1);
                    time++;
                }
            }
            for(int c : list)
            {
                if(c>0) pq.add(c);
            }
            ans+= pq.size()==0 ? time :n+1;
            
        }
        
        
        return ans;
  
        
    }
}
