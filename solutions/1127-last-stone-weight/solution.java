class Solution {
    public int lastStoneWeight(int[] arr) {
        if(arr.length==1) return arr[0];

    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        for(int i=0;i<arr.length;i++) pq.add(arr[i]);

        while(pq.size()>1)
        {
            int a= pq.poll();
            int b =pq.poll();
            int get = Math.abs(a-b);
            if(get!=0) pq.add(get);
        }
        if(pq.size()==0) return 0;
       else  return pq.peek();
    }
}
