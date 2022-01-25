class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<Integer>inner= new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
        
        inner.add(1);
        ans.add(new ArrayList<>(inner));
        inner.clear();
        
        int step=numRows;
        List<Integer>sum_store= new ArrayList<>();
        
        
        int index=1;
        while(index<step)
        {
         
            for(int i=0;i<=ans.size();i++)
            {
                if(i==0)
                {
                    inner.add(1);
                }
                else if(i==ans.size())
                {
                    inner.add(1);
                }
                else
                {
                    inner.add(sum_store.get(i-1));
                }
                
                
            }
            
            sum_store.clear();
            for(int j=0;j<inner.size()-1;j++)
            {
                sum_store.add(inner.get(j)+inner.get(j+1));
            }
            ans.add(new ArrayList<>(inner));
            inner.clear();
            index++;
            
        }
        return ans;
    }
}
