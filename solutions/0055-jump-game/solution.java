class Solution {
    public boolean canJump(int[] arr) {
      int reachable =0;
        int i=0;
        while(i<=reachable)
        {
            reachable= Math.max(reachable,arr[i]+i);
            if(reachable>=arr.length-1)
            {
                return true;
            }
            i++;
        }
        return false;
        
    }
}
