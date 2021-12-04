class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer>h= new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
        }
    PriorityQueue<Map.Entry<Integer,Integer>>pq= new PriorityQueue<>( (a,b) -> b.getValue()-a.getValue());
        
for(Map.Entry<Integer, Integer> entry: h.entrySet()) //h is Object of HashMap
        {
            pq.offer(entry);
            
        }
    
        
        int arr[]= new int[k];
        
        for(int i=0;i<k;i++)
        {
            arr[i]= pq.poll().getKey();
        }
    return arr;
    
    }
}
