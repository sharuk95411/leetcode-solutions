class Solution {

List<String>ans= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
           A(n,0,0,"");
           return ans;
    }

    public void A(int n,int open,int close,String temp)
    {
        if(open>n || close>open) return ;
        if(close==n)
        {
            ans.add(temp);
            return ;
        }
        
        A(n,open+1,close,temp+"(");
        A(n,open,close+1,temp+")");
    }
}
