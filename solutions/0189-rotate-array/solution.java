class Solution {
    public void rotate(int[] arr, int k) {
         k= k%arr.length;

        int left=0;
        int right= arr.length-1;

        while(left<right)
        {
            swap(left,right,arr);
            left++;
            right--;
        }

        left=0;
        right= k-1;
        while(left<right)
        {
            swap(left,right,arr);
            left++;
            right--;
        }

        left=k;
        right= arr.length-1;
        while(left<right)
        {
            swap(left,right,arr);
            left++;
            right--;
        }

    }
    public void swap(int left,int right,int arr[])
    {
        int temp= arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
