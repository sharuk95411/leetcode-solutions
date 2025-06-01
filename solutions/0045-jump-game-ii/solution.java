class Solution {
    Integer memo[];
    public int jump(int[] arr) {
        
        if(arr.length==1) return 0;
        memo= new Integer[arr.length+1];
         return A(0,arr);
    }
    public int A(int i,int arr[])
    {
        if(i>=arr.length-1) return 0;
        else if (arr[i]==0) return Integer.MAX_VALUE;
        else if (memo[i]!=null) return memo[i];

        int ans=Integer.MAX_VALUE;
        int jumps= arr[i];
     
        for(int j=1;j<=jumps;j++)
        {
            int a= 1+A(i+j,arr);
            if(a!=Integer.MIN_VALUE)
            ans=Math.min(ans,a);
        }
        return memo[i]=ans;
    }
}
