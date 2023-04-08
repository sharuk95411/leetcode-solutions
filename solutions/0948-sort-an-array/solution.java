class Solution {
    public int[] sortArray(int[] nums) {
        
        devide(nums,0,nums.length-1);
        return nums;
    }

    public void devide(int arr[], int left,int right)
    {
        if(left<right)
        {
            int mid= left+(right-left)/2;
            devide(arr,left,mid);
            devide(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public void merge(int arr[],int left,int mid,int right)
    {
        int temp[]= new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=right)
        {
            if(arr[i]<=arr[j])
            {
                temp[k++]=arr[i++];
            }
            else
            {
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=right)
        {
            temp[k++]= arr[j++];
        }
        k=0;
        for(i=left;i<=right;i++)
        {
             arr[i]= temp[k++];
           
        }
        
    }
}
