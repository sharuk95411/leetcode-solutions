class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer>inner= new ArrayList<>();
        Arrays.sort(nums);
        // outer.add(new ArrayList<>(inner));
        fun(0,nums,inner);
        return outer;
    }

    public void fun(int i,int arr[],List<Integer>inner)
    {
        if(i==arr.length)
        {
            // if(!outer.contains(inner))
            outer.add(new ArrayList<>(inner));
            return ;
        }
        inner.add(arr[i]);
        fun(i+1,arr,inner);
        inner.remove(inner.size()-1);
  while(i+1<arr.length && arr[i]==arr[i+1]) i++;  // check for not add dublicates 
        fun(i+1,arr,inner);
    
    }
}
