class A
{
    int pass ,drop;

    A(int a, int b)
    {
        pass=a;
        drop=b;
    }
}

class Solution {
    public boolean carPooling(int[][] arr, int capacity) {
        
         PriorityQueue<A> minHeap = new PriorityQueue<>(new Comparator<A>() {
            public int compare(A x, A y) {
                return Integer.compare(x.drop, y.drop); // ascending order of b
            }
        });

        for(int i=0;i<arr.length;i++)
        {
            minHeap.add(new A(arr[i][0],arr[i][2]));
        }
         
         Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        int cap= arr[0][0];
        if(cap>capacity) return false;

        for(int i=1;i<arr.length;i++)
        {
            int pick = arr[i][1];
            A obj= minHeap.peek();
            while(!minHeap.isEmpty()&&pick>=obj.drop)
            {
                  cap= cap-obj.pass;
                  minHeap.poll();
                  obj= minHeap.peek();
            }
            cap= cap+arr[i][0];
            if(cap>capacity) return false;
        }
        return true;
    }
}
