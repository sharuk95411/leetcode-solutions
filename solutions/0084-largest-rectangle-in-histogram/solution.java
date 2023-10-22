class Solution {
    public int largestRectangleArea(int[] arr) {
        
        int area=0;
        int l_min[]=new int[arr.length];
        int r_min[]=new int[arr.length];
        l_min[0]=-1;
        r_min[arr.length-1]= arr.length;
        
        Stack<Integer>stack=new Stack();
        stack.push(arr.length-1);
        
        for(int i=arr.length-2;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
            {
                       stack.pop();
            }
            if(stack.isEmpty()) r_min[i]=arr.length;
            else r_min[i]= stack.peek();
            stack.push(i);
        }
        
        // Left Min index 
        stack.clear();
        stack.push(0);
        for(int i=1;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i])
            {
                       stack.pop();
            }
            if(stack.isEmpty()) l_min[i]=-1;
            else l_min[i]= stack.peek();
            stack.push(i);
        }
        
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
              int a= Math.abs(r_min[i]-l_min[i]-1)*arr[i];
            ans=Math.max(a,ans);
        }
        
        System.out.println(Arrays.toString(l_min));
         System.out.println(Arrays.toString(r_min));
        
        return ans;
    }
}
