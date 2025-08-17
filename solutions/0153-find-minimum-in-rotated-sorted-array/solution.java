class Solution {

    public int findMin(int[] arr) {

        int ans=arr[0];

       
        int left=0;
        int right= arr.length-1;

        while(left<=right)
        {
            int mid= left+(right-left)/2;
            ans=Math.min(ans,arr[mid]);
            if(arr[right]>arr[mid]) right=mid-1;
            else left=mid+1;

        }
        // ans=Math.min(ans,arr[mid]);
        return ans;
        
    }
}
