class Solution {
     List<String>list= new ArrayList<>();
    public List<String> generateParenthesis(int n) {
       
        A(0,0,"",n);
        return list;
    }
    public void A(int left,int right,String s,int n)
    {
        if(s.length()==2*n)
        {
            list.add(s);
            s=s.substring(0,s.length()-1);
            return ;
        }
        if(left<n)
        {
            A(left+1,right,s+"(",n);
        }
        if(right<left)
        {
            A(left,right+1,s+")",n);
        }
    }
}
