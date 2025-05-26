class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>inner = new ArrayList<>();
        inner.add(1);
        ans.add(new ArrayList<>(inner));
        if(n==1) return ans ;
        while(n>1)
        {
            
          List<Integer>list= new ArrayList<>(inner);
           inner= new ArrayList<>();
           inner.add(1);
           for(int i=0;i<list.size()-1;i++)
           {
                     inner.add(list.get(i)+list.get(i+1));
           }
           inner.add(1);
           ans.add(new ArrayList<>(inner));
           n--;
            
        }
 return ans;

    }
}
