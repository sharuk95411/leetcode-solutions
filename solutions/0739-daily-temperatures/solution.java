class Solution {

    class Pair
    {
        int value,index;
        Pair(int v,int i)
        {
            value=v;
            index=i;
        }
    }
    public int[] dailyTemperatures(int[] arr) {
        Stack<Pair>stack= new Stack<>();
        int ans[]=new int[arr.length];

        stack.push(new Pair(arr[arr.length-1],arr.length-1));

        for(int j=arr.length-2;j>=0;j--)
        {
            int data= arr[j];
            while(!stack.isEmpty()&& data>=stack.peek().value )
            {
                stack.pop();
            }
            if(stack.isEmpty()) ans[j]=0;
            else ans[j]= stack.peek().index-j;
            stack.push(new Pair(data,j));

        } 
        return ans;
    }
}
