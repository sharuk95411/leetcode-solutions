class Solution {
    public int[] twoSum(int[] arr, int target) {
        int ans[]= new int[2];
        HashMap<Integer,Integer>h= new HashMap<>();
        
      
        for(int i=0;i<arr.length;i++)
        {
            int value= target-arr[i];
            if(h.containsKey(value))
            {
                ans[0]=i;
                ans[1]= h.get(value);
                break;
            }
            {
                h.put(arr[i],i);
            }
        }
            
        
        
        return ans;
    }
}
