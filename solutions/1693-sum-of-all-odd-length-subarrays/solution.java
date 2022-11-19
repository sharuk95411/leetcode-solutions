class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum=0;
        int n= arr.length;
        for(int i=0;i<arr.length;i++)
        {
             int start= n-i;
            int end= i+1;
            int total= start*end;
            
            sum+= (total+1)/2*arr[i];
        }
        return sum;
    }
}
