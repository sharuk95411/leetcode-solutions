class Solution {
    List<List<Integer>>ans= new ArrayList<>();
    public List<List<Integer>> permute(int[] arr) {
        
        boolean check[]= new boolean[arr.length];
        List<Integer>inner = new ArrayList<>();

        A(arr,check,inner);
        return ans;
    }
    public void A(int arr[],boolean check[],List<Integer>inner)
    {
        if(inner.size()==arr.length)
        {
            ans.add(new ArrayList<>(inner));
            return ;
        }

       for(int i=0;i<arr.length;i++)
       {
        if(check[i]==false)
        {
            check[i]=true;
            inner.add(arr[i]);
            A(arr,check,inner);
            check[i]=false;
            inner.remove(inner.size()-1);
        }
       }
    }
}
