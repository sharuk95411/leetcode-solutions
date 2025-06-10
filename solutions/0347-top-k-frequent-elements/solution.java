class Solution {
    public int[] topKFrequent(int[] nums, int k) {

       HashMap<Integer,Integer>h= new HashMap<>();
       
       for(int a :nums)
       {
        h.put(a,h.getOrDefault(a,0)+1);
       }

    

     PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

      pq.addAll(h.entrySet());

        int ans[]= new int[k];

          int i=0;
          while(k>0)
          {
             Map.Entry<Integer, Integer> entry = pq.poll();
            ans[i++]=entry.getKey();
            k--;
          }
          return ans;
       
    }
}
