class Solution {
    boolean b=true;
    public int[] searchRange(int[] arr, int target) {

int ans[]=new int[2];
      if(arr.length==0)
      {
        ans[0]=-1;
        ans[1]=-1;
        return ans;
      }
        
        ans[0]=arr.length-1;
        ans[1]=0;
        A(arr,target,0,arr.length-1,ans);
        if(b)
        {
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        return ans;

    }
    public void A (int arr[],int target,int left,int right,int ans[])
    {
        if(left>right)return ;
        int mid =(left+right)/2;
        if(arr[mid]==target)
        {
            b=false;
            ans[0]=Math.min(mid,ans[0]);
            ans[1]=Math.max(mid,ans[1]);
            A(arr,target,left,mid-1,ans);
            A(arr,target,mid+1,right,ans);
        }
        else if(arr[mid]>target)  A(arr,target,left,mid-1,ans);
        else A(arr,target,mid+1,right,ans);
    }
}
