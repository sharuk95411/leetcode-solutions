class Solution {
    public int calculate(String s) {
         s = s.replaceAll("\\s", "");
         System.out.println("LENNGTH IS "+s.length());
         Stack<Integer>stack= new Stack<>();
         boolean opr=false;
         int n1=0;
         int i=0;
         while(i<s.length())
         {
             n1=0;
             char c= s.charAt(i);
             if(c=='-')
             {
             opr=true;
             }
             else if(Character.isDigit(c))
             {
              while(i<s.length()&&Character.isDigit(s.charAt(i)))
             {
                n1=n1*10+Character.getNumericValue(s.charAt(i)); 
                i++; 
             }
             if(opr)
             {
                 stack.push(-n1);
                 opr=false;
             } else 
             {
                   stack.push(n1);
             }
            i--;
             }
            else if(c=='*' || c=='/')
             {
             i++;
             while(i<s.length()&&Character.isDigit(s.charAt(i)))
             {
                n1=n1*10+Character.getNumericValue(s.charAt(i)); 
                i++; 
             }
               if(c=='/') stack.push(stack.pop()/n1);
               else stack.push(stack.pop()*n1);
               i--;
             }
             i++;

         }
         while(stack.size()>1)
         {
             stack.push(stack.pop()+stack.pop());
         }
         return stack.peek();

         
    }
}
