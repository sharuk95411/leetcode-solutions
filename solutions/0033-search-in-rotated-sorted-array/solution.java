class Solution {
    public int search(int[] arr, int target) {
         
         int ans=-1;

         int left=0;
         int right= arr.length-1;

         while(left<=right)
         {
            int mid= left+(right-left)/2;

            if(arr[mid]==target) return mid;

            if(arr[right]>arr[mid])
            {
                if(arr[right]>=target && target>=arr[mid]) left=mid+1;
                else right=mid-1;
            }
            else
            {             
                       if(target<=arr[mid] && target>=arr[left]) right=mid-1;
                       else left=mid+1;
            }

         }
         return ans;
    }
}
