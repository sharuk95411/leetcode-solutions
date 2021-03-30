class Solution {
    public int subarraySum(int[] arr, int k) {
         int count=0;
        int prefixSum=0;
        HashMap<Integer,Integer>h= new HashMap<>();
        h.put(0,1);
        for(int i=0;i<arr.length;i++)
        {
           prefixSum= prefixSum+arr[i]; 
           
           if(h.containsKey(prefixSum-k))
           {
               count= count+h.get(prefixSum-k);
                 
              //  System.out.println("OK");
           }
           h.put(prefixSum,h.getOrDefault(prefixSum,0)+1); // isme getOrDefault() function ka acha use hua h
         
           
        }
        return count;
        
    }
}
