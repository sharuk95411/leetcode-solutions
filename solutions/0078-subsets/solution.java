class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        
         List<Integer>l1= new ArrayList<>();
         List<List<Integer>>l2= new ArrayList<>();
        rec(arr,0,l1,l2);
        return l2;
        
    }
        static void rec(int arr[], int i,List<Integer>l1,List<List<Integer>>l2)
    {
        if(i==arr.length)
        {
            l2.add(new ArrayList<>(l1));
            return;
        }
        l1.add(arr[i]);
        rec(arr,i+1,l1,l2);
        l1.remove(l1.size()-1);
        rec(arr,i+1,l1,l2);
    }
}
