class Solution {

    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>inner = new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        
         ans.add(inner);
        A(arr,0);
       
        return ans;
    }

    public void A(int arr[],int index)
    {
        // if(index==arr.length)
        // {
        //     ans.add(new ArrayList<>(inner));
        //     return ;
        // }
        for(int i=index;i<arr.length;i++)
        {
            inner.add(arr[i]);
            ans.add(new ArrayList<>(inner));
            A(arr,i+1);
            inner.remove(inner.size()-1);
        }
    }
}
