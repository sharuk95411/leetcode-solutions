class Solution {
    public List<String> generateParenthesis(int n) {
         List<String>l= new ArrayList<>();
       StringBuilder sb1 = new StringBuilder("");
       int open=n;
       int close=n;
       return B(n,open,close,sb1,l);
        
    }
        static List<String>B(int n,int open,int close, StringBuilder sb1,List<String>l)
    {
        if(open==0 && close ==0)
        {
        String s = sb1.toString();
        l.add(s);
   //   s=  sb1.substring(0, sb1.length() - 1);
   return l;
      
        
        }
        if(open!=0)
        {
            sb1.append("(");
            B(n,open-1,close,sb1,l);
             sb1=sb1.delete(sb1.length()-1,sb1.length());

        }
        if(close>open)
        {
            sb1.append(")");
         B(n,open,close-1,sb1,l);
       String s= sb1.substring(0, sb1.length() - 1);
       sb1=sb1.delete(sb1.length()-1,sb1.length());
            
        }
           
        return l;
    }
}
