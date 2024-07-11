class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>list= new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        A(0,arr);
        return ans;
        
    }

    public void A(int i,int arr[])
    {
        if(i>=arr.length)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }

        list.add(arr[i]);
        A(i+1,arr);
        list.remove(list.size()-1);
        A(i+1,arr);
         
    }
}
