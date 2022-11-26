class Solution {
    public void rotate(int[][] arr) {
        
        int n=arr.length ;
        
        for(int i=0;i<n/2;i++)
        {
            int temp[]= arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1]= temp;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n&&j<i ;j++)
            {
                int temp= arr[j][i];
                arr[j][i]=  arr[i][j];
                arr[i][j]= temp;
            }
        }
        
    }
}
