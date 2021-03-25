class Solution {
    public void rotate(int[][] arr) {
             Queue<Integer> q = new LinkedList<Integer>();
          for(int i=0;i<arr.length;i++)
          {
              for(int j=arr.length-1;j>=0;j--)
              {
                  q.add(arr[j][i]);
              }
          }
          
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr.length;j++)
    {
      arr[i][j]= q.poll();
    }
}
        
    }
}
