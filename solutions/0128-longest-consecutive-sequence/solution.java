class Solution {
    public int longestConsecutive(int[] arr) {
        
        HashMap<Integer,Boolean>h= new HashMap<>();
       for(int a : arr)
       {
           h.put(a,true);
       }

         for (Map.Entry<Integer,Boolean> m : h.entrySet())
        {
         int key = m.getKey();
            if(h.get(key-1)!=null)
            {
                h.put(key,false);
            }
          }
          System.out.println("VALUE "+h.get(3));

int ans=0;
        for (Map.Entry<Integer,Boolean> m : h.entrySet())
        {
        
         int key = m.getKey();
         if(h.get(key)==true)
         {
             int temp=1;
             key++;
             while(h.get(key)!=null && h.get(key)==false)
             {
                 temp++;
                 key++;
             }
             ans= Math.max(temp,ans);
         }
            
          }
          return ans;
        
    }
}
