class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }

   PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> h.get(a) - h.get(b));

                
for (Map.Entry<Integer,Integer> m : h.entrySet())
{
     int key = m.getKey();
     minHeap.add(key);
      while(minHeap.size()>k)
            minHeap.poll();

}
int ans[]= new int[k];
  for(int i=0;i<k;i++)
  {
      ans[i]= minHeap.poll();
  }
  return ans;

    }
}
