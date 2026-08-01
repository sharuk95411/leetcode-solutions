class Solution {
    public int[] dailyTemperatures(int[] arr) {

     int ans[]  = new int[arr.length];
     Stack<Integer>stack= new Stack<>();
     stack.push(arr.length-1);

     ans[arr.length-1]=0;

     for(int i=arr.length-2;i>=0;i--)
     {
        int no = arr[i];
        while(!stack.isEmpty()&&no>=arr[stack.peek()])
        {
            stack.pop();
        }
        if(stack.isEmpty()) ans[i]=0;
        else ans[i]= stack.peek()-i;
        stack.push(i);

     }

      return ans;
    }
}
