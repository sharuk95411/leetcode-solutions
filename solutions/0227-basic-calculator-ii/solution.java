class Solution {
    public int calculate(String s) {
        
        int ans=0;
        char opr= '+';
        int num=0;
        Stack<Integer>stack= new Stack<>();

        for(char chr : (s + "+").toCharArray())
        {
            if(chr==' ') continue;
            if(Character.isDigit(chr))
            {
                num= num*10+chr-'0';
            }
            else
            {
                    switch(opr){  
    
    case '+': stack.push(num) ;
    break;  
    case '-': stack.push(-num)  ;
    break;  
    case '/':  stack.push(stack.pop()/num); 
    break;  
     case '*': stack.push(stack.pop()*num);
    }  
    num=0;
    opr =chr;
            }
        }

        while(!stack.isEmpty())
        {
            ans= ans+stack.pop();
        }
        return ans;
    }
}
