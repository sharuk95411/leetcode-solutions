class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        Stack<Integer>stack= new Stack<>();
        int ans[]=new int[arr.length];
        stack.push(arr.length-1);
        int i=arr.length-2;
        
        while(i>=0)
        {
            while(!stack.isEmpty()&& arr[i]>=arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty()==true)
            {
                System.out.println("TRUE");
                stack.push(i);
                i--;
            }
            else
            {
                ans[i]=stack.peek()-i;
                stack.push(i);
                i--;
            }
        }
        return ans;
    }
}
