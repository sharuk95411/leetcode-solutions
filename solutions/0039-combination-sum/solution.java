class Solution {

    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        List<Integer>list= new ArrayList<>();
        Arrays.sort(arr);
        A(arr,target,0,list);
        return ans;
    }
    public void A(int arr[],int sum,int i,List<Integer>list)
    {
        if(i>=arr.length|| sum<0) return ;

        if(sum==0)
        {
            ans.add(new ArrayList<>(list));
           return ;
        } 
        list.add(arr[i]);
        A(arr,sum-arr[i],i,list);
        list.remove(list.size()-1);
        A(arr,sum,i+1,list);
    }
}
