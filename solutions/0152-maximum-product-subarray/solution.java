class Solution {
    public int maxProduct(int[] arr) {
        
        int ans=arr[0];
        int min=arr[0];
        int max=arr[0];
        
        for(int i=1;i<arr.length;i++)
        {
            
            
//             if(arr[i]==0)
//             {
//                 if(i==arr.length-1)return Math.max(ans,arr[i]);
//                 else
//                 {
//                 ans=Math.max(arr[i],ans);
//                 max=0;
//                 min=0;
//                 i++;
//                 }
               
//             }
            
            if(arr[i]<0)
            {
                int temp= max;
                max=min;
                min=temp;
            }
            
            max= Math.max(arr[i]*max,arr[i]);
            min= Math.min(arr[i]*min,arr[i]);
            
            ans=Math.max(max,ans);
           
        }
        
        return ans;
        
    }
}
