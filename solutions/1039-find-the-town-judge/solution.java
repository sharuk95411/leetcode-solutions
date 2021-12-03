class Solution {
    /*
            for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    }

    */
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return n;
        if(trust.length==0) return -1;
        
        int arr[]= new int[n];
      //  System.out.println(trust.length);
        HashMap<Integer,Integer>h= new HashMap<>();
        List<Integer>l= new ArrayList<>();
            
        
        for(int i=0;i<trust.length;i++)
        {
            int no= trust[i][0];
            h.put(trust[i][1], h.getOrDefault(trust[i][1],0)+1);
            l.add(trust[i][0]);
        }
        
        for(Map.Entry<Integer,Integer>obj : h.entrySet())
        {
            if(obj.getValue()==n-1 && l.contains(obj.getKey())==false)
                return obj.getKey();
        }
       
        return -1;
    }
}
