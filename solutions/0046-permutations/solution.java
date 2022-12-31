class Solution {
    boolean visited[];
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
     visited= new boolean[nums.length];
     A(nums);
return outer ;
    }

    public void A(int arr[])
    {
        if(inner.size()==arr.length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        
        for(int i=0;i<arr.length;i++)
        {
         if(visited[i]==false)
        {
            inner.add(arr[i]);
            visited[i]=true;
            A(arr);
            inner.remove(inner.size()-1);
            visited[i]=false;
            
        }
        }
      
    }
}
