class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer>h= new HashMap<>();
        for(int a:nums)
        {
            h.put(a,h.getOrDefault(a,0)+1);
          
        }

        List<Integer>[] arr = new ArrayList[nums.length+1];
         int ans[]=new int[k];
         for(Map.Entry<Integer,Integer>map: h.entrySet())
         {
            int index= map.getValue();
            if(arr[index]==null)
            {
                arr[index]= new ArrayList<>();
            }
                arr[index].add(map.getKey());
         }

         int j = arr.length-1;
         int i=0;
         while(i<ans.length && j>=0)
         {
            if(arr[j]!=null)
            {
                List<Integer>l= arr[j];
                for(int a:l)
                {
                    ans[i]=a;
                    i++;
                }
            }
            j--;
         }

       return ans;
        
    }
}
