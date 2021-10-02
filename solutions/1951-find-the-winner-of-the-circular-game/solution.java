class Solution {
    // logic Coded Decoded
    // TC O(n2) and SC O(n);
    // Queue Used 
    public int findTheWinner(int n, int k) {
        
        int res = 0;
        for (int i = 1; i <= n; ++i)
            res = (res + k) % i;
        
        return res + 1;
    }
}
