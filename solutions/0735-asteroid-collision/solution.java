class Solution {
    public int[] asteroidCollision(int[] arr) {
        
        int n = arr.length;
        Stack<Integer>stack= new Stack<>();
        stack.push(arr[0]);

        for(int i=1;i<n;i++)
        {
             if(stack.isEmpty()) stack.push(arr[i]);
           else if(arr[i]<0 && stack.peek()<0)
            {
                          stack.push(arr[i]);
            }
            else if (arr[i]>0 && stack.peek()>0)
            {
                    stack.push(arr[i]);
            }

            else if (arr[i]>0 && stack.peek()<0)
            {
                stack.push(arr[i]);
            }
            else if( arr[i]<0 && stack.peek()>0)
            {
                int a= Math.abs(arr[i]);
                boolean b=true;
                     while(!stack.isEmpty() && stack.peek()>0)
                     {
                        if(a>stack.peek()) stack.pop();
                        else if( a<stack.peek()) break;
                        else 
                        {
                            stack.pop();
                            b=false;
                            break;
                        }
                       
                     }
                     if(b)
                     {
                     if(stack.isEmpty()) stack.push(arr[i]);
                     else if (stack.peek()<0) stack.push(arr[i]);
                     }
                    
            }
        }
        
        int ans[]= new int[stack.size()];
         for(int i=ans.length-1;i>=0;i--)
         {
            System.out.println("ELE "+stack.peek());
            ans[i]=stack.pop();
         }
         return ans;

    }
}
