
class Solution {

Integer arr[];
    public int climbStairs(int n) {
        arr=new Integer[n+1];
        return A(n);
    }

    public int A(int n)
    {
        if(n==0) return 1;
        else if(n<0) return 0;
        else if (arr[n]!=null) return arr[n];
        int way1= A(n-1);
        int way2 = A(n-2);
        return arr[n]= way1+way2;
    }
}
