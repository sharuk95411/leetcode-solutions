class Solution {
    
    class Pair
    {
        int i,j;
        Pair(int a,int b)
        {
            i=a;
            j=b;
        }
    }
    public int orangesRotting(int[][] arr) {
        
        Queue<Pair>q= new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==2)q.add(new Pair(i,j));
            }
        }
        int time=0;
        while(!q.isEmpty())
        { 
            boolean b=false;
            int size=q.size();
         while(size>0)
        {
            Pair p=q.poll();
            int i=p.i;
            int j=p.j;
            if(j+1<arr[0].length && arr[i][j+1]==1)
            {
                arr[i][j+1]=2;
                q.add(new Pair(i,j+1));
                b=true;
            }
            if(j-1>=0 && arr[i][j-1]==1)
            {
                arr[i][j-1]=2;
                q.add(new Pair(i,j-1));
                 b=true;
            }
            if(i+1<arr.length && arr[i+1][j]==1)
            {
                arr[i+1][j]=2;
                q.add(new Pair(i+1,j));
                 b=true;
            }
            if(i-1>=0 && arr[i-1][j]==1)
            {
                arr[i-1][j]=2;
                q.add(new Pair(i-1,j));
                 b=true;
            }
            size--;
        }
            if(b)time++;
        }
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)return -1;
            }
        }
        
        
        return time;
    }
}
