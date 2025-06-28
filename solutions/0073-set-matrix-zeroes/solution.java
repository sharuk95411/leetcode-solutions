class Solution {
    public void setZeroes(int[][] arr) {
        
     boolean firstrow=false;
     boolean firstcol=false;
     int row= arr[0].length;

         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==0)
                {
                    if(i==0) firstrow=true;
                    if(j==0) firstcol= true;
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
         }

         for(int i=1;i<arr[0].length;i++)
         {
            if(arr[0][i]==0)
            {
                System.out.println("rowwise "+i);
                for(int j=0;j<arr.length;j++)
                {
                    arr[j][i]=0;
                }
            }
         }

         for(int j=1;j<arr.length;j++)
         {
            if(arr[j][0]==0)
            { 
               System.out.println("colwise "+j);
                 for(int i=0;i<arr[0].length;i++)
                {
                    arr[j][i]=0;
                }
            }
         }
         if(firstrow)
         {
            System.out.println("FirstRow true");
            for(int i=0;i<arr[0].length;i++)
            {
                arr[0][i]=0;
            }
         }
         if(firstcol)
         {
             System.out.println("FirstCol true");
            for(int j=0;j<arr.length;j++)
            {
                arr[j][0]=0;
            }
         }

    }
}
