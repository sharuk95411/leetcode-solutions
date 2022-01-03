class Solution {
    
    // logic -codebix TYN 
    //Hint- two data Str will be used  1- HashMap second List
    public int findJudge(int n, int[][] trust) {
      if(trust.length==0 && n==1) return 1;
        if(trust.length==0) return -1;
        
        HashMap<Integer,Integer>h= new HashMap<>(); 
        List<Integer>l= new ArrayList<>(); // iske andr wo log ayge jo dsro pr trust kr rhe h 
            
        
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
