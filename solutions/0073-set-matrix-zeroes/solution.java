class Solution {
    public void setZeroes(int[][] arr) {
        
         boolean row= false;
         for(int j=0;j<arr[0].length;j++)
         {
             if(arr[0][j]==0)
             {
                 row=true;
                 break;
             }
         }
         boolean col= false;
         for(int i=0;i<arr.length;i++)
         {
             if(arr[i][0]==0)
             {
                 col=true;
                 break;
             }
         }

         for(int i=1;i<arr.length;i++)
         {
             for(int j=arr[0].length-1;j>=1;j--)
             {
                 if(arr[i][j]==0)
                 {
                     arr[0][j]=0;
                     arr[i][0]=0;
                 }
             }
         }

       for(int i=1;i<arr.length;i++)
         {
             for(int j=arr[0].length-1;j>=1;j--)
             {
                 if(arr[0][j]==0 || arr[i][0]==0)
                 {
                     arr[i][j]=0;
                 }
             }
         }
         if(row)
         {
             for(int j=0;j<arr[0].length;j++)
             {
                 arr[0][j]=0;
             }
             System.out.println("OK1");
         }
         if(col)
         {
             for(int i=0;i<arr.length;i++)
             {
                 arr[i][0]=0;
             }
              System.out.println("OK2");
         }


         


        
    }
}
