class Solution {

    public List<Integer> spiralOrder(int[][] arr) {
        
        List<Integer>ans= new ArrayList<>();
        int left=0;
        int top=0;
        int right= arr[0].length-1;
        int bottom= arr.length-1;
        
        boolean b=true;
        int i=0;

        while(ans.size()<arr.length*arr[0].length)
        {
             i=left;
            while(i<=right&&ans.size()<arr.length*arr[0].length )
            {
                ans.add(arr[top][i]);
                i++;
            }
            top++;
            i= top;
            while(i<=bottom && ans.size()<arr.length*arr[0].length)
            {
                ans.add(arr[i][right]);
                i++;
            }
            right--;
            i=right;
            while(i>=left &&ans.size()<arr.length*arr[0].length)
            {
                ans.add(arr[bottom][i]);
                i--;
            } 
            bottom--;
            i=bottom;
            while(i>=top && ans.size()<arr.length*arr[0].length)
            {
                ans.add(arr[i][left]);
                i--;
            }
            left++;
            
        }
        return ans;

    }
}
