

class Solution {


    class Pair
{
    int row,col;
    Pair(int i,int j)
    {
        row=i;
        col=j;
    }
}

    public int numIslands(char[][] arr) {
        Queue<Pair> q = new LinkedList<>();
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]=='1')
                {
                    
                    ans++;
                    q.add(new Pair(i,j));
                    while(!q.isEmpty())
                    {
                        Pair p= q.poll();
                        int row=p.row;
                        int col=p.col;
                        A(row,col-1,arr,q); //left
                        A(row,col+1,arr,q); // Right
                        A(row-1,col,arr,q);  // Top
                        A(row+1,col,arr,q);   // Bottom
                    }
                }
            }
        }
        return ans;
    }

    public void A(int i,int j,char arr[][],Queue<Pair>q)
    {
        if(i<0 || j<0) return;
        else if (j==arr[0].length || i==arr.length) return ;
        else if(arr[i][j]=='1')
        {
            q.add(new Pair(i,j));
            arr[i][j]='0';
        }
    }
}
