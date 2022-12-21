class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target)
    {
                  A(arr,0,target);
                  return outer;    
    }
    public void A(int arr[], int index,int target)
    {
        if(target==0)
        {
            outer.add(new ArrayList<>(inner));
            return;
        }
        else if (target<0)
        {
            return ;
        }
        else if (index==arr.length)
        {
            return ;
        }

        inner.add(arr[index]);
        A(arr,index,target-arr[index]);
        inner.remove(inner.size()-1);

        A(arr,index+1,target);
    }

}
