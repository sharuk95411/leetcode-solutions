class Solution {
    public int calculate(String s) {
        
        Stack<Integer>s1= new Stack<>();
        Stack<Character>s2= new Stack<>();
        s = s.replaceAll("\\s", "");
        // System.out.println("Length is "+s.length());
        int i=0;
          
        while(i<s.length())
        {
                char c= s.charAt(i);
                if(Character.isDigit(s.charAt(i)))
                {
                    
                      int num=0;
                      while(i<s.length() && Character.isDigit(s.charAt(i)))
                      {
                          num =num*10+s.charAt(i)-'0';
                          i++;  
                           
                      }
                      if(!s2.isEmpty()&&s2.peek()=='-')
                      {
                        s1.push(-num);
                        s2.pop();
                        s2.push('+');
                      }
                      else
                      s1.push(num);
                }
                else
                {

                   switch (c) {
                  case '+':
                {
                    s2.push('+');
                    i++;
                    break;
                }
                
            case '-':
            {
                s2.push('-');
                i++;
                break;
            }
                
            case '*':
                {
                  int a= s1.pop();
                  i++;
                   int b=0;
                      while(i<s.length() && Character.isDigit(s.charAt(i)))
                      {
                          b =b*10+s.charAt(i)-'0';
                          i++;  
                         
                      }
                      s1.push(a*b);
                     break;
                }
            case '/':
                 {
                  int a= s1.pop();
                  i++;
                   int b=0;
                      while(i<s.length() && Character.isDigit(s.charAt(i)))
                      {
                          b =b*10+s.charAt(i)-'0';
                          i++;  
                      }
                      s1.push(a/b);
                     break;
                }
                   } 
                }

        }
     
     int ans=0;
      while(!s1.isEmpty())
        {
            ans= ans+s1.pop();
        }
        return ans;
    }
    
}
