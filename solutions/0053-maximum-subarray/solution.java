class Solution {
    public int maxSubArray(int[] arr) {

     int max= arr[0];
     int sum=arr[0];
     for(int i=1;i<arr.length;i++)
     {
        int current = arr[i];
        sum= sum+arr[i];
        System.out.println("sum is "+sum);

        if(current>sum)
        {
            max=Math.max(max,current);
            sum=current;

        }
        else
        {
            max=Math.max(max,sum);
        }
        
        
       
     }
     return max;

    }
}
