class Solution {
    public void rotate(int[][] arr) {
     
        if(arr.length==0 || arr[0].length==0) return ;
        int n= arr.length;
        
        for(int i=0;i<n/2;i++)
        {
            int temp[]= arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1]= temp;
            
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
    }
}
