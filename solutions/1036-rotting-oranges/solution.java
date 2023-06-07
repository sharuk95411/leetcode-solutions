class Solution {
    public int orangesRotting(int[][] arr) {
    class Pair 
    {
        int x,y;
        public Pair (int a,int b)
        {
            x=a;
            y=b;
        }
    }
        
    Queue<Pair> Q = new LinkedList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==2)
                {
                    Q.add(new Pair(i,j));
                }
            }
        }
        int ans=0;
        while(Q.size()>0)
        {
                  int count=Q.size();
                  boolean check= false;
                  while(count>0)
                  {
                      Pair p= Q.poll();
                      int i= p.x;
                      int j= p.y;
                      if(j-1>=0 && arr[i][j-1]==1)
                      {
                          arr[i][j-1]=2;
                          Q.add(new Pair(i,j-1));
                          check=true;
                      }
                      if(j+1<arr[0].length && arr[i][j+1]==1)
                      {
                          arr[i][j+1]=2;
                          Q.add(new Pair(i,j+1));
                          check=true;
                      }
                    if(i-1>=0 && arr[i-1][j]==1)
                    {
                        arr[i-1][j]=2;
                        Q.add(new Pair(i-1,j));
                        check=true;
                    }
                    if(i+1<arr.length && arr[i+1][j]==1)
                    {
                        arr[i+1][j]=2;
                        Q.add(new Pair(i+1,j));
                        check=true;
                    }
                    count--;
}
                    if(check)
                    {
                        ans++;
                        check=false;
                    }
                  
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    return -1;
                }
            }
        }
        return ans;
        

    }
}
