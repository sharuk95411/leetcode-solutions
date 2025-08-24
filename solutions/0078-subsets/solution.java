class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        
      ArrayList<Integer>list= new ArrayList<>();
      ans.add(new ArrayList<>(list));
        A(arr,0,list);
        return ans;
    }

    public void A(int arr[],int index,List<Integer>list)
    {

        if(index>=arr.length)  return ;
        list.add(arr[index]);
        ans.add(new ArrayList<>(list)); // choose It and move forword
        A(arr,index+1,list);  
        list.remove(list.size()-1);    
        A(arr,index+1,list);  // Not Choose It and move forword
    }
}
