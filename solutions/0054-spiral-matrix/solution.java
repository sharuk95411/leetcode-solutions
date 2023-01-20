class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>l= new ArrayList<>();
        if(arr.length==0)return l;
        int left=0;
        int right= arr[0].length-1;
        int top=0;
        int down= arr.length-1;
        int dir=0;

        while(left<=right && top<=down)
        {

          if(dir==0)
          {
              for(int j=left;j<=right;j++)
              {
                  l.add(arr[left][j]);
              }
              top++;
          }
          else if(dir==1)
          {
              for(int i=top;i<=down;i++)
              {
                  l.add(arr[i][right]);
              }
              right--;
          }
          else if(dir==2)
          {
              for(int j=right;j>=left;j--)
              {
                  l.add(arr[down][j]);
              }
              down--;
          }
          else if(dir==3)
          {
              for(int i=down;i>=top;i--)
              {
                  l.add(arr[i][left]);
              }
              left++;
          }

  dir= (dir+1)%4;

        }
        return l;
    }
}
