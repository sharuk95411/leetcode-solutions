class Solution {
    private int ans;
    public int singleNonDuplicate(int[] arr) {
        
        A(arr,0,arr.length-1);
        return ans;
    }

    public void A (int arr[],int left,int right)
    {

        if(left>right) return ;
        int mid = (left+right)/2;
        if(mid==0) 
        {
             ans=arr[mid];
            return ;
        }
        else if(mid==arr.length-1) 
        {
            ans=arr[mid];
            return ;
        }
        int rcount = right-mid;
        int lcount= mid-left;
        if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1])
        {
            ans=arr[mid];
            return ;
        }
        else if (arr[mid]==arr[mid+1] )
        {
               if(rcount%2==0) A(arr,mid,right);
               else A(arr,left,mid-1);
        }
         else if( lcount%2==0)
         {
            A(arr,left,mid);
         }
         else
         A(arr,mid+1,right);
        return ;
    }
}
