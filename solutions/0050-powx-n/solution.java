class Solution {
    public double myPow(double x, int n) {
        
        
        if(n==0) return 1.000000;
        Double num=x;
        Double ans=1.0;
    
        long temp= n;
        if(temp<0)temp=-1*temp;
        while(temp>0)
        {
            if(temp%2!=0)
            {
                ans= ans*x;
                temp=temp-1;
            }
            else
            {
                x=x*x;
                temp= temp/2;
            }
        }
        
        return n>0? ans : 1/ans;
    }
}
