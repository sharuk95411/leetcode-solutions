

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer>list= new ArrayList<>();
        int top=0;
        int left=0;
        int down= arr.length-1;
        int right= arr[0].length-1;
        int steps= (down+1)*(right+1);
         System.out.println("Steps are-- "+steps);
  
        while(steps>0)
        { 
          System.out.println("Steps are-- "+steps);
  
                for(int i= left;i<=right && steps>0 ;i++)
                {
                    list.add(arr[top][i]);
                    steps--;
                }
                top++;
  
                for(int i=top;i<=down && steps>0 ;i++)
                {
                    list.add(arr[i][right]);  
                    steps--;
                }
                right--;
            
          
                for(int i=right;i>=left && steps>0 ;i--)
                {
                    list.add(arr[down][i]);
                    steps--;
                }
                down--;
            
           
                for(int i=down;i>=top && steps>0 ;i--)
                {
                    list.add(arr[i][left]);
                    steps--;
                    
                }
                left++;
            
          
        }
        return list;
        
    }
}
