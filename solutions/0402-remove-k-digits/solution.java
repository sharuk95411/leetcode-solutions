class Solution {
    public String removeKdigits(String s, int k) {
        
        if(s.length()==k) return "0";
        Stack<Character>stack= new Stack<>();
        
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
                while(stack.size()>0 &&(k>0 && stack.peek()-'0'>s.charAt(i)-'0'))
                {
                  //  System.out.println("OK");
                    stack.pop();
                    k--;
                }
            stack.push(s.charAt(i));
        }
        
        while(k>0)
        {
            stack.pop();
            k--;
        }
        StringBuilder str= new StringBuilder();
        while(stack.size()>0)
        {
            str.append(stack.pop());
        }
        s=str.reverse().toString();
        System.out.println(s);
        
        while(s.length()>0 &&s.charAt(0)=='0' || k>0)
        {
            s=s.substring(1);
            k--;
        }
        if(s.length()==0) return "0";
    
        return s;
    }
    
}
