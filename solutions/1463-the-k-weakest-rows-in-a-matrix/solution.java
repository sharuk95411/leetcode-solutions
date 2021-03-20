class Solution {
    public int[] kWeakestRows(int[][] arr, int k) {
        int count=0;
        PriorityQueue<Node> pq= new PriorityQueue<>(new C());
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    count++;
                }
            }
            Node n= new Node(i,count);
pq.add(n);// yha ye add q kia gya h jbki node to automatic priorityQ me store hte jyge.
            count=0;
        }
        
        int a[]= new int[k];
        for(int i=0;i<k;i++){
            Node n=(Node)pq.poll();
            a[i]=n.row;
        }
        return a;

    
    }
    static class Node
    {
        int freq,row;
        Node(int row,int freq)
        {
            this.row= row;
            this.freq= freq;
        }
    }
    static class C implements Comparator<Node>
    {
        public int compare(Node a, Node b)
        {
           /* if(a.freq<b.freq) isko ise kr skte h buit isme ans to sme ayga but order
            {                    chnage ho jyga so niche wla trika use kia gya h but ye
                return -1;       smjh ni aya h
            }
            else if(a.freq>b.freq)
            {
                return 1;
            }
            return 0;*/
             if(a.freq==b.freq){
                return a.row-b.row;
            }else{
                return a.freq-b.freq;
            }
        }
    }
        
    
}
