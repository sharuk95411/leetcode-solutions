class Solution {
    public int largestRectangleArea(int[] arr) {
        
        if(arr.length==0) return 0;
        if(arr.length==1) return arr[0];
        int n= arr.length;
        int left[]= new int[n];
        int right[]= new int[n];
        
        left[0]=0;
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            while(j>=0 && arr[j]>=arr[i])
            {
                j= left[j]-1;
            }
            left[i]= j+1;
        }
        
        System.out.println(Arrays.toString(left));
        
        right[n-1]= n-1;
        for(int i=n-2;i>=0;i--)
        {
            int j=i+1;
            while(j<arr.length && arr[j]>=arr[i])
            {
                j= right[j]+1;
            }
            right[i]= j-1;
        }
        System.out.println(Arrays.toString(right));
        
        int maxArea= 0;
        for(int i=0;i<arr.length;i++)
        {
            int area= Math.abs(right[i]-left[i]+1)*arr[i];
            System.out.println(area);
            maxArea= Math.max(maxArea,area);
        }
        return maxArea;
    
    }
}
