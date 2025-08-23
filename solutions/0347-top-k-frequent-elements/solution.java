class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
        Map<Integer,Integer>h= new HashMap<>();

        for(int a:arr)
        {
                 h.put(a,h.getOrDefault(a,0)+1);
        }


PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->h.get(a)-h.get(b));
       
       for(int key :h.keySet() )
       {
            pq.add(key);
            if(pq.size()>k) pq.remove(  );
       }
       int ans[]= new int[k];
       
       int i=0;
       while(pq.size()>0)
       {
            ans[i]= pq.remove();
            i++;
       }
       return ans;

    }
}
