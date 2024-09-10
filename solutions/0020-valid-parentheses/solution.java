class Solution {
    public boolean isValid(String s) {

        if(s.length()%2!=0) return false;
        Stack<Character>stack= new Stack<>();
         
         for(int i=0;i<s.length();i++)
         {
            char c= s.charAt(i);

            switch(c)
            {
                case '(' : stack.push(c); 
                break;
                case '{' : stack.push(c);
                break;
                case '[' : stack.push(c);
                break;
                case ')':
                if(!stack.isEmpty() && stack.peek()=='(') 
                {
                    stack.pop();
                    System.out.println("Remove "+'(');
                    break;
                }
                else return false;
                 case '}':
                if(!stack.isEmpty() && stack.peek()=='{')
                {
                    stack.pop();
                    System.out.println("Remove "+'{');
                    break;
                }
                else return false;
                 case ']':
                if(!stack.isEmpty() && stack.peek()=='[') 
                {
                    stack.pop();
                    System.out.println("Remove "+'[');
                    break;
                }
                else return false;
            }
            System.out.println("size "+stack.size());
         }
         if(stack.isEmpty()) return true;
         return false;
    }
}
