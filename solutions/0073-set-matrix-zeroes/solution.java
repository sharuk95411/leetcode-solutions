class Solution {
    public void setZeroes(int[][] arr) {
        
        boolean firstRow=false;
        boolean firstCol= false;
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[0][j]==0)
            {
                firstRow=true;
                break;
            }

        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][0]==0)
            {
                firstCol=true;
                break;
            }
        }

        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[0][j]=0;
                    arr[i][0]=0;
                }
            }
        }

        for(int j=1;j<arr[0].length;j++)
        {
            if(arr[0][j]==0)
            {
                for(int i=0;i<arr.length;i++)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]==0)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    arr[i][j]=0;
                }
            }
        }
        if(firstRow)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[0][j]=0;
            }
        }
        if(firstCol)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }
    }
}
