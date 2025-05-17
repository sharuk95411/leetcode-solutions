class Solution {
    int ans=-1;
    public int search(int[] arr, int target) {
         
         A(arr,0,arr.length-1,target);
         return ans;
    }

    public void A(int arr[],int left,int right,int target)
    {
        if(left>right) return;
        int mid = left+(right-left)/2;
        if(arr[mid]==target)
        {
            ans=mid;
            return;
        }

        if(arr[mid]>=arr[left])
        {
            if(arr[left]<=target && arr[mid]>=target)
            A(arr,left,mid-1,target);
            else A(arr,mid+1,right,target);
        }
        else
        {
            if(arr[mid]<=target && arr[right]>=target)
            A(arr,mid+1,right,target);
            else A(arr,left,mid-1,target);
        }
    }
}
