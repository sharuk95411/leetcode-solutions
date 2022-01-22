class Solution {
    boolean arr[];
    public boolean winnerSquareGame(int n) {
       
        arr= new boolean[n+1];
        return winnerUtil(n);
    }
    private boolean winnerUtil(int n) {
        // base case
        if(n<=0)
            return false;
        
        // main logic
        if(arr[n]==true) return true;
        for(int i=1;i*i<=n;i++) {
            // The move Alice makes = i*i
            int opponent = n-i*i;
            if(winnerUtil(opponent)==false)
                return true;
            
            arr[opponent]=true;
             }
        return false; 
    }
}
