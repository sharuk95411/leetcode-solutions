class Solution {
    
    int[] t;
    public int combinationSum4(int[] arr, int target) {
          t = new int[target+1];
        Arrays.fill(t,-1);
        Arrays.sort(arr);
        return A(arr,target);
             
    }
    public int A(int arr[],int target)
    {
        if(target==0) 
        {
            // System.out.println("WORKING");
           return 1;
        }
       
        if(target<0) return 0;
         if(t[target] != -1) {
            return t[target];
        }
         int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans+A(arr,target-arr[i]);
            
            
        }
         return t[target] = ans;
    }
}
