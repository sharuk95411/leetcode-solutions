// logic codebix.
// bht pyra question h must try yourself.
//Recursion me hum probelm ko subprbmlem me devide kr lte h jo ki isme hga isko phle recusion then Memoization then tabulation se krna .
// isme hmne char ko integer me bdhle k liye function b seekha h.

class Solution {
    public int numDecodings(String s) {
        int n= s.length();
        int t[]= new int[n+1];
        if(n==0) return 0;
        
        t[0]=1;
        t[1]= s.charAt(0)!='0' ? 1:0 ;
            for(int i=2;i<n+1;i++)
            {
                int first= Integer.parseInt(s.substring(i-1,i));
                int second= Integer.parseInt(s.substring(i-2,i)) ;
                    if(first>0 && first<=9)
                    {
                        t[i]= t[i-1];
                        
                    }
                if(second>9 && second<=26)
                {
                    t[i]= t[i]+t[i-2];
                }
            }
        return t[n];
    }
}
