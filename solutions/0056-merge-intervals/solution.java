class Solution {
    public int[][] merge(int[][] arr) {
         Arrays.sort(arr, (a,b) -> a[0] - b[0]);
         Stack<int []>s= new Stack<>();
         s.add(arr[0]);
         for(int i=1;i<arr.length;i++)
         {
             int start2= arr[i][0];
             int finish2= arr[i][1];
             int a[]= s.peek();
             if(a[1]>=start2)
             {
                 a[1]= Math.max(a[1],finish2);
             }
             else
             {
                 s.add(arr[i]);
             }
         }
         System.out.println(s.size());
        int arr1[][]= new int[s.size()][2];
        for(int i=arr1.length-1;i>=0;i--)
        {
            int b[]= s.pop();
            arr1[i][0]=b[0];
            arr1[i][1]=b[1];
        }
        return arr1;
        
    }
}
