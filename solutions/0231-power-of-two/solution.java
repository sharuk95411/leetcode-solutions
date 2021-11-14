class Solution {
    public boolean isPowerOfTwo(int n) {
        
/* check if n can be divided by 2. If yes, divide n by 2 and check it repeatedly.

if (n <= 0) return false;
while (n%2 == 0) n/=2;
return n == 1;
Time complexity = O(log n)

*/
        if(n<=0) return false;
        
        return (n & (n-1))==0? true :false;
        
        
    }
}
