class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
  
    public List<List<Integer>> subsets(int[] arr) {
        ans.add(new ArrayList<>(inner));
        A(0,arr);
        return ans;
        
    }
   public void A(int j,int arr[])
    {
         for(int i=j;i<arr.length;i++)
         {
             inner.add(arr[i]);
             ans.add(new ArrayList<>(inner));
             A(i+1,arr);
             inner.remove(inner.size()-1);
         }
    }
}
