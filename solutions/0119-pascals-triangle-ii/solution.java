class Solution {
    public List<Integer> getRow(int A) {
                int n= A+1;

        List<List<Integer>>outer= new ArrayList<>();
        
          List<Integer>inner= new ArrayList<>();
        inner.add(1);
        
        outer.add(inner);
    
        
        
        for(int i=1;i<n;i++)
        {
        inner= new ArrayList<>();
            inner.add(1);
            for(int j=1;j<outer.size();j++)
            {
                inner.add(outer.get(i-1).get(j-1)+outer.get(i-1).get(j));
            }
            inner.add(1);
            outer.add(inner);
        }
        
        return outer.get(A);
    
    }
}
