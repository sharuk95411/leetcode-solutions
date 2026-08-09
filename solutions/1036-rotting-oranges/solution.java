
class Pair{

    int row,col;
    Pair(int i ,int j)
    {
        row=i;
        col=j;
    }
}

class Solution {
    public int orangesRotting(int[][] arr) {

        Queue<Pair>q= new LinkedList<>();
        int ans=0;
         for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==2)
                q.add(new Pair(i,j));
            }
         }
             Boolean b=true;
                   while(b)
                    {     
                       boolean find=false;
                         int size= q.size();
                         int left=0,right=0,top=0,bottom=0;
                         while(size>0)
                         {
                            Pair p= q.poll();
                            int row=p.row;
                            int col= p.col;
                             left= A(row,col-1,arr,q);
                             right = A(row,col+1,arr,q);
                             top = A(row-1,col,arr,q);
                             bottom = A(row+1,col,arr,q);
                            if(left==1 || right==1 || top ==1 || bottom ==1)
                            {
                                find=true;
                            }
                             size--;
                            
                         }
                          if(find)ans++;
                         else b=false;
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
     public int A(int row,int col,int arr[][],Queue<Pair>q)
    {
        
        if(row<0 || row==arr.length || col<0 || col==arr[0].length) return 0;
        if(arr[row][col]==1)
        {
            q.add(new Pair(row,col));
            arr[row][col]=-1;
            return 1;
        }
        return 0;
    }
}
