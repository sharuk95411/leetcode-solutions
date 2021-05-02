// MonoTonic Stack ka concept use hua h isme TC is O(n) but SC is O(n).
//Monotonic stack k bre me notes me likha h.
class Solution {
    public int trap(int[] arr) {
        if(arr.length<3)
        {
            return 0;
        }
        
        int leftMax[]= new int[arr.length];
        leftMax[0]=0;
        Stack<Integer>s1= new Stack<>();
        s1.push(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            if(s1.peek()>arr[i])
            {
                leftMax[i]=s1.peek();
            }
            else
            {
                while(s1.size()>0 && arr[i]>s1.peek())
                {
                    s1.pop();
                }
                if(s1.size()==0)
                {
                    leftMax[i]=0;
                }
                else
                {
                    leftMax[i]= s1.peek();
                }
                s1.push(arr[i]);
            }
        }
        
        int rightMax[]= new int[arr.length];
        
        leftMax[arr.length-1]=0;
        Stack<Integer>s2= new Stack<>();
        s2.push(arr[arr.length-1]);
        for(int i= arr.length-2;i>=0;i--)
        {
           if(s2.peek()>arr[i])
            {
                rightMax[i]=s2.peek();
            }
            else
            {
                while(s2.size()>0 && arr[i]>s2.peek())
                {
                    s2.pop();
                }
                if(s2.size()==0)
                {
                    rightMax[i]=0;
                }
                else
                {
                    rightMax[i]= s2.peek();
                }
                s2.push(arr[i]);
            }
        }
        
        int result=0;
        for(int i=0;i<arr.length;i++)
        {
            int min= Math.min(leftMax[i],rightMax[i]);
            int z= min-arr[i];
            if(z>0)
            {
                result=result+z;
            }
        }
        return(result);
        
    }
}
