class Solution {
    public List<List<Integer>> generate(int a) {
        
        List<Integer>inner=new ArrayList<>();
        List<List<Integer>>ans= new ArrayList<>();
        
        inner.add(1);
        ans.add(new ArrayList<>(inner));
        
        for(int i=2;i<=a;i++)
        {
            List<Integer>temp= new ArrayList<>();
            temp.add(1);
            if(ans.size()>1)
            {
                inner=ans.get(i-2);
                for(int j=1;j<inner.size();j++)
                {
                    temp.add((inner.get(j-1)+inner.get(j)));
                }
            }
            temp.add(1);
            ans.add(new ArrayList<>(temp));
        }
        return ans;
        
    }
}
