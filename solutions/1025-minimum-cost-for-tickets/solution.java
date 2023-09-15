class Solution {
    
    int ans=Integer.MAX_VALUE;
    
    public int mincostTickets(int[] days, int[] costs) {
        
        int dp[]=new int[days.length+1];
        A(days,costs,0,0,dp);
        return ans;
    }

    public int A (int day[],int cost[],int i,int m,int dp[])
    {
        if(i>=day.length)return 0;
           if(m>=day[i]) 
           {
               return A(day,cost,i+1,m,dp);
           }
        if(dp[i]!=0)return dp[i];
          int a= cost[0]+A(day,cost,i+1,day[i]+1-1,dp);
           int b= cost[1]+A(day,cost,i+1,day[i]+7-1,dp);
            int c= cost[2]+A(day,cost,i+1,day[i]+30-1,dp);
         
        ans=Math.min(Math.min(a,b),c);
        
return dp[i]=ans;
    }
}

