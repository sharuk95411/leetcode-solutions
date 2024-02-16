class Solution {
    public void rotate(int[][] arr) {
        
        int i=0;
        int j=0;
        int n= arr[0].length;
        
        for(int a=0;a<n-1;a++)
        {
            int k=j+1;
            while(k<n)
            {
                int temp=arr[i][k];
                arr[i][k]=arr[k][i];
                arr[k][i]=temp;
                k++;
            }
            i++;
            j++;
        }
        int l=0;
        int r=n-1;
        while(l<r)
        {
            for(i=0;i<n;i++)
            {
                int temp= arr[i][l];
                arr[i][l]= arr[i][r];
                arr[i][r]=temp;
            }
            l++;
            r--;
        }
        
    }
}
