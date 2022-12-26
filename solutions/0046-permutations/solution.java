class Solution {
    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
     boolean check[];
    public List<List<Integer>> permute(int[] arr) {
        
      //int n= nums.length;
       check= new boolean[arr.length];
      A(arr);
      return outer;
    }

    public void A(int arr[])
    {
        if(inner.size()==arr.length)
            {
                outer.add(new ArrayList<>(inner));
                return;
            }
        for(int i=0;i<arr.length;i++)
        {

               
            if(check[i]==false)
            {
            inner.add(arr[i]);
             check[i]= true;
            A(arr);
           inner.remove(inner.size()-1);
           check[i]= false;
               
            }
            
           
        }
        
    }
}
