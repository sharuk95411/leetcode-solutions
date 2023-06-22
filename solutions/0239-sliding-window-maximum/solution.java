class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n= arr.length;
        int ans[]= new int[n-k+1];
         Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            while(q.size()>0 &&arr[i]>q.peekFirst())  q.pollFirst(); // check from left    
             while(q.size()>0 &&arr[i]>q.peekLast()) q.pollLast();  // check from end
            q.addLast(arr[i]);
        }
        
        int max= q.peekFirst();
        int index=0;
        ans[index++]=max;
        int i=1;
        int j=k;
        while(j<n)
        {
            while(q.size()>0 && arr[j]>q.peekFirst()) q.pollFirst(); // check from left;
            while(q.size()>0 &&arr[j]>q.peekLast()) q.pollLast(); // check from last;
            q.addLast(arr[j]);
            if(arr[i-1]==q.peekFirst()) q.pollFirst();
            max=q.peekFirst();
            ans[index++]=max;
            i++;
            j++;
        }   
        return ans;
        
         }
}
