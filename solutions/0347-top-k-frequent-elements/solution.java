class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        
        List<Integer>[ ] freq = new ArrayList[arr.length+1];

        HashMap<Integer,Integer>h= new HashMap<>();
        for(int a :arr)
        {
            h.put(a,h.getOrDefault(a,0)+1);
        }

        for (Map.Entry<Integer,Integer> m : h.entrySet())
        {
         int key = m.getKey();
         int value = m.getValue();
        if(freq[value]==null)
        {
            List<Integer>l= new ArrayList<>();
            l.add(key);
            freq[value]=l;
        }
        else
        {
                List<Integer>l= freq[value];
                l.add(key);
        }
          }

             int ans[]= new int[k];
             for(int i=freq.length-1;i>=0;i--)
             {
                 if(freq[i]!=null)
                 {
                     List<Integer>l= freq[i];
                    int j=0;
                    while(k>0 && j<l.size())
                    {
                        ans[k-1]=l.get(j);
                        j++;
                        k--;
                    }
                 }
             }
        return ans;

    }
}
