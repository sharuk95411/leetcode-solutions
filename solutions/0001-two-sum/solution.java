class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]= new int[2];
        
     HashMap<Integer,Integer>h= new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(target-arr[i]))
            {
                ans[0]=i;
                ans[1]= h.get(target-arr[i]);
                break;
            }
            h.put(arr[i],i);
        }
        
        return ans;
       
    }
}
