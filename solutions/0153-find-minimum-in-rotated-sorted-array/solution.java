class Solution {

int ans= Integer.MAX_VALUE;
    public int findMin(int[] arr) {
        
        
        A(arr,0,arr.length-1);
        return ans;
    }

 public void A(int arr[],int left,int right)
 {

            if(left>right) return ;
            int mid= left+(right-left)/2;
            ans=Math.min(ans,arr[mid]);
            if(arr[mid]>=arr[left])
            {
                if(arr[left]>arr[right]) A(arr,mid+1,right);
                else A(arr,left,mid-1);

            }
            else A(arr,left,mid-1);
 }

}
