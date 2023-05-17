class Solution {
    List<String>ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder str= new StringBuilder();
         A(n,0,0,str);
         return ans;
    }

    public void A(int n,int open,int close,StringBuilder str)
    {
        if(str.length()==2*n)
        {
            ans.add(str.toString());
            return ;
        }
        if(open<n)
        {
            str.append("(");
            A(n,open+1,close,str);
            str.delete(str.length()-1,str.length());
        }
        if(close<open)
        {
            str.append(")");
            A(n,open,close+1,str);
              str.delete(str.length()-1,str.length());
        }
    }
}
