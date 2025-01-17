class Solution {
    public int fib(int n) {
        int arr[]= new int[n+1];
        Arrays.fill(arr,-1);

        return A(n ,arr);
    }

    public int A (int n,int arr[])
    {
        if(n<=1) return n;

        if(arr[n]!=-1) return arr[n];

        return arr[n]= A(n-1,arr)+A(n-2,arr);
    }
}
