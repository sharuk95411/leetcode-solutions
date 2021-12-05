class Solution {
    
    Integer dp[];
    public int rob(int[] arr) {
        
        if(arr.length<=1) return arr[0];
        dp= new Integer[arr.length];
        
    
        int a= A(arr,0,true);
        Arrays.fill(dp,null);
        int b= A(arr,1,false);
        
        return Math.max(a,b);
    }
    
    private int A (int arr[],int index,boolean b)
    {
        if(b==true)
        {
             if(index>=arr.length-1) return 0;
        }
        if(b==false)
        {
            if(index>=arr.length) return 0;
        }
       
        if(dp[index]!=null) return dp[index];
         
        int even= arr[index]+A(arr,index+2,b);
       
        
        int odd= A(arr,index+1,b);
        
        return dp[index]= Math.max(even,odd);
        
    }
}
