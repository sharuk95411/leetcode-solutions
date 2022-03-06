class Solution {
    static final int MOD = (int)1e9+7;
    public int countOrders(int n) {
        //n*2 spaces, get n*2 choose 2 * countOrders(n-2)
        if(n < 2){
            return 1;
        }
        long cur = (n*(2*n-1))%MOD;
        return (int)(cur * countOrders(n-1) % MOD);
    }
}
