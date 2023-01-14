 class Pair
          {
              int row=0;
              int col=0;
              Pair(int r,int c)
              {
                  this.row=r;
                  this.col=c;
              }
          }
          class Solution {
              boolean check=false;
         public int orangesRotting(int[][] arr) {
          
            Queue<Pair>q= new LinkedList<>();
          
          for(int i=0;i<arr.length;i++)
          {
              for(int j=0;j<arr[0].length;j++)
              {
                  if(arr[i][j]==2)
                  {
                q.add(new Pair(i,j));
                  }
              }
          }

          //if(q.isEmpty()) return 0;

          int ans=0;

            while(!q.isEmpty())
            {
                int size= q.size();
                while(size>0)
                {
                    Pair p= q.poll();
                    int row= p.row;
                    int col= p.col;
                    Call(arr,row,col,q);
                    size--;
                }
                    if(check==true)
                   {
                                ans++;
                                check=false;
                   }
                
            }

            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    if(arr[i][j]==1) return -1;
                }
            }
            return ans;

    }
    
            public void Call(int arr[][],int row,int col,Queue<Pair>q)
            {
                System.out.println("ROW "+row);
                System.out.println("COL "+col);
                  if(col+1<arr[0].length && arr[row][col+1]==1)
                  {
                     arr[row][col+1]=2;
                     q.add(new Pair(row,col+1));
                     check=true;
                  }
                  if(col-1>=0 &&  arr[row][col-1]==1)
                  {
                      arr[row][col-1]=2;
                      q.add(new Pair(row,col-1));
                      check=true;
                  }
                  if(row+1<arr.length && arr[row+1][col]==1)
                  {
                      arr[row+1][col]=2;
                      q.add(new Pair(row+1,col));
                      check=true;
                  }
                  if(row-1>=0 && arr[row-1][col]==1)
                  {
                      arr[row-1][col]=2;
                      q.add(new Pair(row-1,col));
                      check=true;
                  }
            }
}  
