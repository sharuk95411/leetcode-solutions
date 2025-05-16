class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        
        List<Integer>inner = new ArrayList<>();
        ans.add(new ArrayList<>(inner));
        A(arr,0,inner);
        return ans;
    }

    public void A(int arr[],int index,List<Integer>inner)
    {

        for(int i=index;i<arr.length;i++)
        {
            inner.add(arr[i]);
            ans.add(new ArrayList<>(inner));
            A(arr,i+1,inner);
            inner.remove(inner.size()-1);

        }

    }
}
