class Solution {
    public int findMin(int[] arr) {
        
        int n= arr.length;
        int left=0;
        int right=n-1;
        int ans=Integer.MAX_VALUE;
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            ans=Math.min(arr[mid],ans);
            
            if(arr[mid]<arr[right])right=mid-1;
            else left=mid+1;
            
        }
        return ans;
    }
}
