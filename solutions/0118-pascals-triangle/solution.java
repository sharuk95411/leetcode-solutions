class Solution {
    public List<List<Integer>> generate(int num) {
        List<Integer>inner= new ArrayList<>();
        List<List<Integer>>outer= new ArrayList<>();
        
                inner.add(1);
                outer.add(inner);
        for(int i=1;i<num;i++)
        {
            inner= new ArrayList<>();
            inner.add(1);
         //   System.out.println(outer);
         
            for(int j=0;j<outer.get(i-1).size();j++)
            {
                if(j==outer.get(i-1).size()-1)
                {
                    inner.add(1);
                    outer.add(inner);
                    // System.out.println("OK");
                    break;
                } 
                else
                {
                    // int no= outer.get(i-1).get(j);
                    int no= outer.get(i-1).get(j)+outer.get(i-1).get(j+1);
                    inner.add(no);
                }
            }
        }
        return outer;
        
    }
}
