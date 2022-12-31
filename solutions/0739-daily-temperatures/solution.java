class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int ans[]=new int[arr.length];

          Stack<Integer>stack= new Stack<>();
          stack.push(arr.length-1);

          for(int i=arr.length-2;i>=0;i--)
          {
              while(!stack.isEmpty()&& arr[i]>=arr[stack.peek()])
              {
                  stack.pop();
              }
              if(stack.isEmpty())
              {
                  stack.push(i);
              }
              else
              {
                  ans[i]= stack.peek()-i;
                  stack.push(i);
              }
          }
        return ans;
    }
}
