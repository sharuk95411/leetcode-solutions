// good ques
class Solution {
    public boolean isValid(String s) {
        if(s.length()==1 || s.length()%2 !=0)
        {
            return false;
        }
        Stack<Character>stack= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='[')
            {
                stack.push(s.charAt(i));
                
            }
             if (stack.isEmpty()) 
                
             {return false ;}
            
            char check; 
            switch (s.charAt(i)) { 
            case ')': 
                check = stack.pop(); 
                if (check == '{' || check == '[') 
                    return false; 
                break; 
  
            case '}': 
                check = stack.pop(); 
                if (check == '(' || check == '[') 
                    return false; 
                break; 
  
            case ']': 
                check = stack.pop(); 
                if (check == '(' || check == '{') 
                    return false; 
                break; 
            
            
            
        }
    }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
