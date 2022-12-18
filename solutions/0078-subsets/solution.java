class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {

     int i=0;
     A(nums,i);
     return outer;
    }

    public void A(int arr[], int i)
    {
        if(i==arr.length)
        {
            outer.add(new ArrayList<>(inner));
            return ;
        }

          inner.add(arr[i]);
          A(arr,i+1);
          inner.remove(inner.size()-1);

          A(arr,i+1);
    }
}
