class Solution {
    public int climbStairs(int n) {
        
        int arr[]= new int[n+1];
        Arrays.fill(arr, -1);
        return A(0,n,arr);
    }
    public int A(int start,int des,int arr[])
    {
        if(start>des)return 0;
        if(start==des) return 1;
        if(arr[start]!=-1)return arr[start];

        arr[start]= A(start+1,des,arr)+A(start+2,des,arr);
        return arr[start];
    }
}
