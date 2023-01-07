class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer>h= new HashMap<>();
  for(int i=0;i<arr.length;i++)
  {
    h.put(arr[i],h.getOrDefault(arr[i],0)+1);
  }

  PriorityQueue<Integer>pq= new PriorityQueue<>((a,b)->h.get(b)-h.get(a));
             for (Map.Entry<Integer,Integer> m : h.entrySet())
           {
           pq.add(m.getKey());
           }
       int ans[]= new int[k];
           while(k>0)
           {
          ans[k-1]=pq.poll();
          k--;
           }
           return ans;
    }
}
