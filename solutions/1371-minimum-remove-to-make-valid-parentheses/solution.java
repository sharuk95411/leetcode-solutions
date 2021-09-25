class Solution {
    public String minRemoveToMakeValid(String s) {
     Stack<Integer>stack= new Stack<>();
        char ch[]= s.toCharArray();
        int n= ch.length;
        
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='(') stack.push(i);
            
            else if(ch[i]==')')
            {
                if(stack.size()>0) stack.pop();
                else ch[i]='*';
            }
        }
        while(stack.size()>0) ch[stack.pop()]='*';
        
        StringBuilder str= new StringBuilder();
        for(char c: ch)
        {
            if(c!='*') str.append(c);
        }
        return str.toString();
        
    }
}
