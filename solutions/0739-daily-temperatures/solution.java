class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int ans[]=new int[arr.length];
        Stack<Integer>stack= new Stack<>();
        int n= arr.length;
        stack.push(n-1);
        for(int i=n-2;i>=0;i--)
        {
            int no = arr[i];
            while(!stack.isEmpty()&& no>=arr[stack.peek()])
            {
                    stack.pop();
               
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
