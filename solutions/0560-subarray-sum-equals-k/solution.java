class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer>h= new HashMap<>();
        h.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
             sum=sum+arr[i];
             if(h.containsKey(sum-k))
             {
                ans=ans+h.get(sum-k);
             }
             h.put(sum,h.getOrDefault(sum,0)+1);

        }
        return ans;
        
    }
}
