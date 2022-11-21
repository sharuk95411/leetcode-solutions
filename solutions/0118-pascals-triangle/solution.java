class Solution {
    public List<List<Integer>> generate(int no) {
        
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>l1, l2= null;
        
        for(int i=0;i<no;i++)
        {
            l1= new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    l1.add(1);
                }
                else
                {
                    l1.add(l2.get(j-1)+l2.get(j));
                }
            }
            ans.add(l1);
            l2=l1;
        }
        return ans;
    }
}
