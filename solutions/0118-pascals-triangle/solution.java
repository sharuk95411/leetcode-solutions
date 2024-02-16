class Solution {
        List<Integer>inner= new ArrayList<>();
        List<List<Integer>>outer= new ArrayList<>();
    public List<List<Integer>> generate(int num) {
        inner.add(1);
        outer.add(new ArrayList<>(inner));
        A(num-1);
        return outer;
    }
    
    public void A(int num)
    {
       if(num==0)return ;
         inner.removeAll(inner); 
        inner.add(1);
        List<Integer>l= new ArrayList<>();
        l=outer.get(outer.size()-1);
        for(int i=1;i<l.size();i=i+1)
        {
            int sum= l.get(i-1)+l.get(i); 
            inner.add(sum);
        }
        inner.add(1);
        outer.add(new ArrayList<>(inner));
        A(num-1);
    }
}
