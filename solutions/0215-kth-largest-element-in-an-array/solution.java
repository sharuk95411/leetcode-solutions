class Solution {
    public int findKthLargest(int[] arr, int k) {
        
        PriorityQueue <Integer>pq= new PriorityQueue<>();
        int n= arr.length;
        int i=0;
        while(i<n)
        {
            if(k==0 && arr[i]>pq.peek())
            {
                pq.poll();
                pq.add(arr[i]);
            }
            else if(k>0)
            {
                pq.add(arr[i]);
                k--;
            }
            i++;
        }
        return pq.peek();

    }
}
