class Solution {
    public boolean carPooling(int[][] arr, int capacity) {

     Arrays.sort(arr,new Comparator<int []>()
     {
         public int compare(int[]a,int []b)
         {
             return a[1]-b[1];
         }
     } );
     PriorityQueue<int[]>pq= new PriorityQueue<int[]>(new Comparator <int []>()
     {
         public int compare(int a[],int b[])
         {
             return a[2]-b[2];
         }
     }  ); 
     for(int i=0;i<arr.length;i++)
     {
         while(!pq.isEmpty() && pq.peek()[2]<=arr[i][1])
         {
             capacity=capacity+pq.peek()[0];
             pq.poll();
         }
         
         capacity=capacity-arr[i][0];
         pq.add(arr[i]);
         if(capacity<0)return false;
         
     }  
return true;
    }
}
