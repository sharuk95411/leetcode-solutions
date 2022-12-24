class Solution {
    public void moveZeroes(int[] arr) {
        int n= arr.length;
        int k=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                if(k<0) k=i;
                if(i+1<n && arr[i+1]!=0)
                {
                        int temp= arr[i+1];
                        arr[i+1]= arr[k];
                        arr[k]= temp;
                        k++;
                }
            }
        }
    }
}
