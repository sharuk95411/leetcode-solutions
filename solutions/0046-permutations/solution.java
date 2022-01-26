class Solution {
    boolean check[];
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        check= new boolean[nums.length];
        
        A(nums);
        return outer;
    }
    
    private void A(int arr[])
    {
        if(inner.size()==arr.length)
        {
            outer.add(new ArrayList<>(inner));
             
            return ;
        }
       // else if(index>=arr.length) return ;
        
        for(int i=0;i<arr.length;i++)
        {
            if(check[i]==false)
            {
                inner.add(arr[i]);
                check[i]=true;
                A(arr);
                inner.remove(inner.size()-1);
                 check[i]=false;
                
            } 
        }
        
                
       
    }
}
