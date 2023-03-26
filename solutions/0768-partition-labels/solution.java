class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>ans= new ArrayList<>();
        HashMap<Character,Integer>h= new HashMap<>();
        char[] arr=s.toCharArray();  
         for(int i=0;i<arr.length;i++)
         {
             h.put(arr[i],i);
         }
         int start=0;
         int end= h.get(arr[0]);
         int i=0;
         while(i<arr.length)
         {
             int pos= h.get(arr[i]);
             if(pos>end)
             {
                 end=pos;
                 i++;
             }
            else if(end==i)
             {
                 ans.add(end-start+1);
                 start=i+1;
                 i++;
                 if(i<arr.length) end= h.get(arr[i]);
             }
             else
             i++;

         }

        return ans;
    }
}
