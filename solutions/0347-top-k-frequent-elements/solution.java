class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
 List<Integer>arr[]= new ArrayList[nums.length+1];
     
for (Map.Entry<Integer,Integer> m : map.entrySet())
{
        int key = m.getKey();
        int freq = m.getValue();
        if(arr[freq]==null)
        {
            arr[freq]= new ArrayList<>();
        }
        arr[freq].add(key);
}
int ans[]= new int[k];
int index=0;
for(int i=arr.length-1;i>=0;i--)
{
    if(arr[i]!=null)
    {
            for(int key : arr[i])
            {
                ans[index]= key;
                index++;
                if(index==k) return ans;
            }
    }
}
return ans;
        
        

    }
}
