class Solution {

    List<String>list= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
        A(n,0,0,"");
        return list;
    }

    public void A (int n, int open,int close,String s)
    {

        if(s.length() ==2*n)
        {
            
            list.add(s);
            return ;
        }
        if(open<n)
        {
            
            A(n,open+1,close,s+"(");
            
        }
        if (close<open)
        {
        
            A(n,open,close+1,s+")");
        
        }
        return ;
    }
}
