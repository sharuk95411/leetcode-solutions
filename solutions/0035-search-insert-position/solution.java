class Solution {
       
       int ans=0;

    public int searchInsert(int[] arr, int target) {
        
        // if(target>arr[arr.length-1]) return arr.length;
        // if(arr[0]>target) return 0;
          A(arr,0,arr.length-1,target);
          return ans;
    }
    public void A(int arr[],int left,int right, int target)
    {
        if(left>right)
        {
            ans= left;
            return ;
        }

        int mid= left+(right-left)/2;

        if(arr[mid]==target)
        {
            ans= mid;
            return ;
        }
        else if(target>arr[mid]) A(arr,mid+1,right,target);
        else A(arr,left,mid-1,target);
        
    }
}
