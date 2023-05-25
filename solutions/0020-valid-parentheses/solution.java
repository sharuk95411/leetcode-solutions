class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;

        Stack<Character>stack= new Stack<>();
        int i=0;
        while(i<s.length())
        {
            Character c= s.charAt(i);
            if(c=='(' || c=='{' ||c=='[') 
            {
                stack.push(c);
            }
            else 
            {
                if(stack.isEmpty()) return false;
                if(c==')' && stack.peek()!='(') return false;
                else if(c=='}' && stack.peek()!='{') return false;
                else if(c==']' && stack.peek()!='[') return false;
                else stack.pop();
               
                
            }
             i++;
            
        }
        if(stack.isEmpty()==false) return false;
        else return true;
    }
}
