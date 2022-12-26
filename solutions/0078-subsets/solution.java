class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        
   A(0,arr);
   return outer;
    }

    public void A(int i,int arr[])
    {
        if(i==arr.length)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        if(i>arr.length) return ;

        inner.add(arr[i]);
        A(i+1,arr);
        inner.remove(inner.size()-1);
        A(i+1,arr);
    }
}
