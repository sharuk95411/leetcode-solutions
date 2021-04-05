// Logic self
class Solution {
    public void setZeroes(int[][] arr) {
          int row= arr.length;
        int col= arr[0].length;
        int i=0,j=0;
        int temp[][]= new int[arr.length][arr[0].length];
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                temp[i][j]= arr[i][j];
            }
        }
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    int x=i;
                    int y=j;
                
                while(j>0) // Iterate Left and make whole row zero
                {
                    temp[i][j-1]=0;
                    j--;
                }
                // after iteration again wha pch jana jha hme 0 mila h    
                i=x;
                j=y;
                while(j<col-1) // Iterate right and make whole row zero
                {
                    temp[i][j+1]=0;
                    j++;
                }
                i=x;
                j=y;
                while(i>0) // Iterate Up and make whole column zero
                {
                    temp[i-1][j]=0;
                    i--;
                }
                i=x;
                j=y;
                while(i<row-1) // Iterate Down and make whole column zero
                {
                    temp[i+1][j]=0;
                    i++;
                }
                i=x;
                j=y;
                }
            }
        }
              for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[0].length;j++)
            {
                arr[i][j]= temp[i][j];
            }
            
        }
        
    }
}
