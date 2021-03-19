class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
         int l= arr.length;
        int temp=0;
        int k=0;
        // Flip the image;
        for(int i=0;i<l;i++)
        {
            k=0;
            for(int j=l-1;j>=k;j--)
            {
                if(k==j)
                {    
                    
                    break;
                }
                temp= arr[i][j];
                arr[i][j]= arr[i][k];
                arr[i][k]= temp;
                k++;
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][j]=1;
                }
                else
                {
                    arr[i][j]=0;
                }
            }
        }
        return arr;
        
    }
}
