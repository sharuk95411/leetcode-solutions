class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<=r)
        {
            if(l==r) return arr[l];
            int mid= l+(r-l)/2;
            if(mid%2==0)
            {
             if(arr[mid]==arr[mid+1]) l=mid+2;
                else r=mid;
            }
            else
            {
                if(arr[mid]==arr[mid+1]) r=mid-1;
                else l= mid+1;
            }
        }
        return -1;
    }
}
