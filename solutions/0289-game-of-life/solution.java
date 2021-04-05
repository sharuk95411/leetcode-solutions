class Solution {
    public void gameOfLife(int[][] arr) {
          int row= arr.length;
        int col= arr[0].length;
        int arr1[][]= new int[row][col];
         for(int i=0;i<row;i++)
         {
             for(int j=0;j<col;j++)
             {
                 arr1[i][j]= arr[i][j];
             }
         }
         int one=0, zero=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int x= arr[i][j];
                
               if(i<row && j-1>=0 ) // left 
                {
                    int left= arr[i][j-1];
                    if(left==1)one++;
                    else zero++;
                }
                if(i>=0 && j+1<col)// right
                {
                    int right= arr[i][j+1];
                    if(right==1)one++;
                    else zero++;
                }
                 if(i-1>=0 &&j<col) // up
                {
                    int up= arr[i-1][j];
                    if(up==1)one++;
                    else zero++;
                }
                 if(i+1<row && j>=0) // down
                 {
                     int down= arr[i+1][j];
                     if(down==1)one++;
                    else zero++;
                 }
                 if(i-1>=0 && j+1<col)
                 
                 {
                     int a= arr[i-1][j+1];
                    if(a==1)one++;
                    else zero++;
                 }
                 if(i-1>=0 && j-1>=0)
                 {
                     int b= arr[i-1][j-1];
                     if(b==1)one++;
                    else zero++;
                 }
                 if(i+1<row && j+1<col)
                 {
                     int c= arr[i+1][j+1];
                     if(c==1)one++;
                    else zero++;
                 }
                 if(i+1<row && j-1>=0)
                 {
                     int d= arr[i+1][j-1];
                     if(d==1)one++;
                    else zero++;
                 }
                 if(x==0 && one==3) arr1[i][j]=1;
                 else if ((x==1)&&(one <2 || one>3)) arr1[i][j]=0 ;
                   
                 one =0;
                 zero=0;
            }
            
        }
 for(int i=0;i<row;i++) // yha new array ka data orignal arrray me copy kr rhe h
         {
             for(int j=0;j<col;j++)
             {
                 arr[i][j]= arr1[i][j];
             }
         }
        
    }
}
