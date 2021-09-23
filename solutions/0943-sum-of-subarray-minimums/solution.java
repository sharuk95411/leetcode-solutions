
class Solution {
    class Pair
    {
        int element,nummin;
        Pair(int a,int b)
        {
            element= a;
            nummin=b;
        }
    }
        public int m= (int)Math.pow(10,9)+7;
    public int sumSubarrayMins(int[] arr) {
        if(arr.length==0) return 0;
        
        int n=arr.length;
        int left[]= new int[n];
        int right[]= new int[n];
        ArrayDeque<Pair>stack1= new ArrayDeque<>();
        ArrayDeque<Pair>stack2= new ArrayDeque<>();
        
     for(int i=0;i<n;i++)
  {
         int count=1;
         while(stack1.size()>0 && stack1.peek().element>arr[i])
         {
             count=count+stack1.peek().nummin;
             stack1.pop();
         }
         stack1.push(new Pair(arr[i],count));
         left[i]= count;
         
  }
        for(int i=n-1;i>=0;i--)
        {
            int count=1;
            while(stack2.size()>0 && stack2.peek().element>=arr[i])
            {
                count=count+stack2.peek().nummin;
                stack2.pop();
            }
            stack2.push(new Pair(arr[i],count));
            right[i]= count;
        }
         long res = 0, mod = (int)Math.pow(10,9)+7;
        for (int i = 0; i < n; i++)
            res = (res + (long)arr[i] * left[i] * right[i] ) % mod;
        return (int)res;
        
   
        
        
    }
}
