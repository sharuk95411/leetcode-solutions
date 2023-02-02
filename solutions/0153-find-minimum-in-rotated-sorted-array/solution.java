class Solution {
    public int findMin(int[] arr) {
        

        int left = 0;
        int right= arr.length-1;

        while(left<right)
        {
            if(arr[left]<arr[right]) return arr[left];
            int mid= (left+right)/2;
            if(arr[mid]>arr[right])
            {
                left=mid+1;
            }
            else
            right=mid;
        }
        return arr[left];
    }
}
