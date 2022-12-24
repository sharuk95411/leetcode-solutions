class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int ans[]= new int [arr.length];
        int n= arr.length-1;
        Stack<Integer>stack= new Stack<>();
        stack.push(n);
       ans[n]=0;
       for(int i=n-1;i>=0;i--)
       {
           int count=0;
           while(!stack.isEmpty() &&arr[i]>=arr[stack.peek()])
           {
                stack.pop();
                count++;
           }
           if(!stack.isEmpty())
          {
               ans[i]= stack.peek()-i;
             
          }
                        stack.push(i);
       }
       return ans;
    }
}
