class Solution {
    public String decodeString(String s) {

        Stack<Integer>s1= new Stack<>();
        Stack<String>s2= new Stack<>();
         
         int i=0;

         String ans="";
         while(i<s.length())
         {
            char c= s.charAt(i);
               
             if(Character.isDigit(c))
             {
                int temp=0;
                int num=0;
                   while(s.charAt(i)!='[')
                   {
                        int getNo= s.charAt(i)-'0';
                        num= num*10+getNo;
                        temp++;
                        i++;
                   }

                System.out.println("NUM "+num);
                s1.push(num);
                i--;
             }
             else if(c==']')
             {
                   int num= s1.pop();
                   String temp=s2.pop();
                   while(!s2.isEmpty()&& !s2.peek().equals("["))
                   {
                    //   System.out.println("C "+temp);
                      temp=s2.pop()+temp; 

                   }
                //    System.out.println("NOT  "+temp);
                   if(!s2.isEmpty())s2.pop();
                   String app=temp;
                   while(num>1)
                   {
                        temp=app+temp;
                        num--;
                   }
                   s2.push(temp);
                //    System.out.println("C "+temp);
             }
             else
             {
                String pp=c+"";
                // System.out.println("pp "+pp);
                s2.push(pp);
             }
            i++;
         }

       while(!s2.isEmpty())
       {
       ans= s2.pop()+ans;
       }

        return ans;
    }
}
