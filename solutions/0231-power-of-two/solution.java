class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        return fun(n);
    }
    public boolean fun (int n)
    { 
        if(n==0 || n==2) return true;
        else if(n%2!=0) return false;
        return fun(n/2);
    }
}
