class Solution {
    List<String>ans= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        
    fun(0,0,"",n);
    return ans;
    }
    public void fun(int open,int close,String temp,int n)
    {
        if(temp.length()==2*n)
        {
            ans.add(temp);
            return;
        }
        if(open<n)
        {
            fun(open+1,close,temp+"(",n);
        }
        if(close<open)
        {
            fun(open,close+1,temp+")",n);
        }
    }
}































