class Solution {
    public void setZeroes(int[][] arr) {
        boolean row=false;
        boolean col=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    if(i==0) row=true;
                    if(j==0) col=true;
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }

        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[0][j]==0 || arr[i][0]==0)
                arr[i][j]=0;
            }
        }
        if(row==true)
        {
            for(int j=0;j<arr[0].length;j++)
            {
               arr[0][j]=0;
            }
        }
        if(col==true)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }
    }
}
