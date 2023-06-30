class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        
        int top=0,left=0;
        int down= arr.length-1;
        int right= arr[0].length-1;
        List<Integer>ans=new ArrayList<>();
         boolean b= true;
        while(left<=right && top<=down)
        {
             if(b)
             {
                 b=false;
                  for(int i=left;i<=right;i++)
                {
                    ans.add(arr[top][i]);
                    b=true;
                }
                top++;

             } else b=false;
               
                if(b)
                { 
                    b=false;
                    for(int i=top;i<=down;i++)
                    {
                            ans.add(arr[i][right]);
                             b=true;
                    }
                    right--;
                } else b=false;
                if(b)
                {
                    b=false;
                    for(int i=right;i>=left;i--)
                    {
                        ans.add(arr[down][i]);
                         b=true;
                    }
                    down--;
                } else b=false;

                if(b)
                {
                    b=false;
                   for(int i=down;i>=top;i--)
                    {
                        ans.add(arr[i][left]);
                         b=true;
                    }
                    left++;
                } else b=false;
            
        }
        return ans;
    }
}
