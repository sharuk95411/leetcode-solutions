class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int row = arr.length;
        int col=arr[0].length;
        int top=0,left=0;
        int right= col-1;
        int bottom= row-1;
        
        int count= row*col;
        List<Integer>list= new ArrayList<>();
        
        while(count>0)
        {
             for(int i=top;i<=right;i++)
             {
               list.add(arr[top][i]);
                 count--;
             }
            if(count==0)return list;
               top++;
          
            for(int i=top;i<=bottom;i++)
            {
                list.add(arr[i][right]);
                count--;    
            }
            if(count==0)return list;
            right--;
            for(int i=right;i>=left;i--)
            {
                 list.add(arr[bottom][i]);
                count--;
            }
            if(count==0)return list;
            bottom--;
            for(int i=bottom;i>=top;i--)
            {
                list.add(arr[i][left]);
                count--;
            }
            left++;
        }
        return list;
       
    }
}
