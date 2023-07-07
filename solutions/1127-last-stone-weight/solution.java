class Solution {
    public int lastStoneWeight(int[] arr) {
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
 for(int i=0;i<arr.length;i++)
 {
     pq.add(arr[i]);
 }
 while(pq.size()>1)
 {
     int a = pq.poll();
     int b= pq.poll();
     if(a>b)
     pq.add(a-b);
     

 }
 if(pq.isEmpty())return 0;
 else return pq.peek();

    }
}
