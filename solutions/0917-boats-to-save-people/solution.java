class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        
        int count=0;
    
         Arrays.sort(arr);
          int i=0,j=arr.length-1;
        
        while(i<=j)
        {
           
            int weight= arr[i]+arr[j];
            if(weight<=limit)
            {
                count++;
                i++;
                j--;
            }
            else
            {
                count++;
                j--;
            }
            
        }
        
        // System.out.println(i+" "+j);
       
        return count;
    }
}
