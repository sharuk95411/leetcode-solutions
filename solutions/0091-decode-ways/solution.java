class Solution {
    
    public int numDecodings(String s) {
         if(s.charAt(0)=='0') return 0;
        int ans[]= new int[s.length()+1];
         Arrays.fill(ans,-1);
         return A(s,0,ans);
         
    }

    public int A(String s,int index,int ans[])
    {
        int way1,way2=0;
        if(index>=s.length())
        {
             return 1;
        }
        if(s.charAt(index)=='0')return 0 ;

        if(ans[index]!=-1)return ans[index];
         way1=A(s,index+1,ans);
        if(index+1<s.length())
        {
             int first= s.charAt(index)-'0';
             int second=s.charAt(index+1)-'0';
            //  System.out.println("First "+first+" second "+second);
             if((first==2 && second<7) || (first==1))
             {
                
                way2=A(s,index+2,ans);
             }
              
        }
        ans[index]=way1+way2;
        return ans[index];
    }
}
