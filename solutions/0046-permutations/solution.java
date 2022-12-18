class Solution {
    
    List<List<Integer>>outer = new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean check[]= new boolean[n];
        A(nums,check);
        return outer;
    }

    public void A( int arr[], boolean check[])
{
    if(inner.size()==arr.length)
    {
        outer.add(new ArrayList<>(inner));
        return ;
    }
    for(int i=0;i<arr.length;i++)
    {
        if(check[i]==false)
        {
            inner.add(arr[i]);
            check[i]= true;
            A(arr,check);
            inner.remove(inner.size()-1);
            check[i]= false;
        }
    }
}
}
