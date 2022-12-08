class Solution {
    public int no=0;
    public int fib(int n) {
         fun(n,0,1,0);
         return no;
    }

    public void fun(int n,int prev,int next,int ans)
    {
        if(n==0)
        {
            no= ans;
            return ;
        }

         ans= prev+next;
        fun(n-1,ans,prev,ans);
    }
}
