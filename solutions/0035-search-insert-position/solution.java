class Solution {
    public int searchInsert(int[] arr, int target) {
        
        int l=0;
        int r=arr.length-1;
        int ans=0;
        
         if(target>arr[r]) 
         {
             ans= r+1;
            return ans;
         }
        else if(target<arr[l])
        {
            ans=l;
            return ans;
        }
        else
        {
             while(l<=r)
        {
            int mid= l+ (r-l)/2 ;
            if(arr[mid]==target)
            {
                ans= mid;
                break;
            }
            else if(l+1==r && arr[mid]!=target)
            {
                ans=mid+1;
                break;
            }
            else if(target>arr[mid]) l=mid;
            else r=mid;
        }
        }
       
        return ans;
    }
}
