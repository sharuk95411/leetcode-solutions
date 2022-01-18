class Solution {
    public boolean canReach(int[] arr, int start) {
         if(start<0 || start>=arr.length || arr[start]==-1) return false;
         if(arr[start]==0)return true;
        int val= arr[start];
        arr[start]=-1;  // 0 is unaffected // used to track  traversed elements
       
        
        return canReach(arr,start+val) || canReach(arr,start-val);
        
        
       /* if(start < 0 || start >= arr.length || arr[start] == -1) return false;
        if(arr[start] == 0) return true;
        int val = arr[start];
        arr[start] = -1;
        boolean plus = canReach(arr, start + val);
        boolean minus = canReach(arr, start - val);
        return plus || minus;*/
    }
}
