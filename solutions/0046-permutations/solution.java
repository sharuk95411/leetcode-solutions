class Solution {

    List<List<Integer>>outer= new ArrayList<>();
    List<Integer>inner=new ArrayList<>();
        
    public List<List<Integer>> permute(int[] arr) {
         boolean b[]=new boolean[arr.length];
        A(arr,b);
        return outer;
    }

      public  void A(int arr[],boolean b[])
    {
        if(inner.size()==arr.length)
        {
        
           outer.add(new ArrayList<>(inner));
            return ;
        }

        for(int j=0;j<arr.length;j++)
        {
            if(b[j]==false)
            {
                b[j]=true;
                inner.add(arr[j]);
                A(arr,b);
                inner.remove(inner.size()-1);
                b[j]=false;
            }
        }
    }
}
