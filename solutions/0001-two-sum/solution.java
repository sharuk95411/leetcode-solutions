class Solution {
    public int[] twoSum(int[] arr, int target) {
        
        HashMap<Integer,Integer>h= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            h.put(arr[i],i);
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(target-arr[i])&& h.get(target-arr[i])!=i)
            {
                return new int[]{i,h.get(target-arr[i])};
            }
        }
        return new int []{1,2};

    }
}
