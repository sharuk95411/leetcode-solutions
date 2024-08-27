class Solution {

    List<List<Integer>>ans= new ArrayList<>();
    List<Integer>inner= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        Arrays.sort(arr);
        A(arr,target,0,0);
        return ans;
    }

    public void A (int arr[],int target,int i,int sum)
    {

         if(i>=arr.length) return;
        if(sum>target)
         {
            return ;
         }
         
         else if(sum==target)
         { 
            // System.out.println("Sum "+sum +" and Target "+target);
            ans.add(new ArrayList<>(inner));
            return ;
         }
      else
      {
          
          inner.add(arr[i]);
          A(arr,target,i,sum+arr[i]);
          inner.remove(inner.size()-1);
          A(arr,target,i+1,sum);
        
 
      }

        


        }
         

        
}
