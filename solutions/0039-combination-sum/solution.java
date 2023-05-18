class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        A(candidates,0,0,target);
        return outer;
    }
    public void A(int arr[],int sum,int index,int target)
    {
        if(index>=arr.length) return ;
        if(sum>target) return ;
         if(sum==target)
         {
             outer.add(new ArrayList<>(inner));
             return;
         }
         inner.add(arr[index]);
         A(arr,sum+arr[index],index,target);
         inner.remove(inner.size()-1);
         A(arr,sum,index+1,target);
    }
}
