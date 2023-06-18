class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>ans= new ArrayList<>();
     int i=0;
     int j=arr.length-1;
     while(j-i>=k)
     {
           int left= Math.abs(arr[i]-x);
           int right= Math.abs(arr[j]-x);
           if(right>left || left==right)
           {
               j--;
           }
          else i++;
        
     }
     while(i<=j)
     {
         ans.add(arr[i]);
         i++;
     }
     return ans;   
    }
}
