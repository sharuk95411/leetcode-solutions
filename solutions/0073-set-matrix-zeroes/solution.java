class Solution {
    public void setZeroes(int[][] arr) {
        
        boolean firstRow=false;
        boolean firstCol= false;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                      if(i==0 && arr[i][j]==0) firstRow=true;
                      if(j==0 && arr[i][j]==0) firstCol=true;
                      else if(arr[i][j]==0)
                      {
                        arr[i][0]=0;
                        arr[0][j]=0;
                      }
            }
        }

        for(int j=1;j<arr[0].length;j++)
        {
                if(arr[0][j]==0)
                {
                    setColZero(0,j,arr);
                }
        }

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]==0)
            {
                setRowZero(i,0,arr);
            }
        }
        if(firstRow)  setRowZero(0,0,arr);
        if(firstCol) setColZero(0,0,arr);
    }
  
  public void setColZero(int i,int j,int arr[][] )
  {
                 while(i<arr.length)
                 {
                    arr[i][j]=0;
                    i++;
                 }
  }
  public void setRowZero(int i,int j,int arr[][])
  {
            while(j<arr[0].length)
            {
                arr[i][j]=0;
                j++;
            }
  }

}
