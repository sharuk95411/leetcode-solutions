class Solution {

    public int climbStairs(int n) {
        int arr[]=new int[n+1];
        Arrays.fill(arr,-1);
        return A(n,arr);
    }
    public int A(int n,int arr[])
    {
        if(n==0) return 1;
        if(n<0) return 0;
         if(arr[n]!=-1) return arr[n];
         int way1= A(n-1,arr);
         int way2= A(n-2,arr);
        return  arr[n]=way1+way2;
    }
}
