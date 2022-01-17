class Solution {
    public int jump(int[] arr) {
     
    int curr_reach=0,max_jump=0,jump=0;
        for(int i=0;i<arr.length-1;i++)
        {
            
            max_jump= Math.max(max_jump,i+arr[i]);
            if(i==curr_reach)
            {
                jump++;
                curr_reach= max_jump;
                
            }
        }
        return jump;
    }
}
