class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer>temp= new ArrayList<>();
        fun(0,nums,temp);
        return ans;
    }

    public void fun(int i,int arr[],List<Integer>list)
    {
        if(i==arr.length)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }

        list.add(arr[i]);
        fun(i+1,arr,list);
        list.remove(list.size()-1);

        fun(i+1,arr,list);
    }
}
