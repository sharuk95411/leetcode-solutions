class Solution {
    List<List<Integer>>outer = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer>inner= new ArrayList<>();
        Arrays.sort(candidates);
        fun(0,0,candidates,target,inner);
        return outer;
    }
    public void fun(int i,int sum,int arr[],int target,List<Integer>inner)
    {
        if(sum==target)
        {
            outer.add(new ArrayList<>(inner));
            return ;
        }
        if(sum>target) return ;
        if(i>=arr.length) return ;

         inner.add(arr[i]);
        fun(i+1,sum+arr[i],arr,target,inner);
        inner.remove(inner.size()-1);
    while(i < arr.length-1 && arr[i] == arr[i + 1]) // for check not to add dublicates
            i++;
        fun(i+1,sum,arr,target,inner);
    }
}
