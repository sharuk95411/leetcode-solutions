class Solution {
    
    List<Integer>list =new ArrayList<>();
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
     
        Arrays.sort(arr);
        A(0,arr,target);
        return ans;
        
    }
    
    public void A(int index,int arr[],int target)
    {
        
      
        if((index>=arr.length)||(target<0)) return;
        
        if(target==0) 
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        list.add(arr[index]);
        A(index,arr,target-arr[index]);
        list.remove(list.size()-1);
        A(index+1,arr,target);
        
        }
}
