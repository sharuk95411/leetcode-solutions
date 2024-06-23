class Solution {
    public double minimumAverage(int[] arr) {
        Arrays.sort(arr);
        
        int n= arr.length/2;
        double ans=Double.MAX_VALUE;
        int l=0;
        int r=arr.length-1;
        
        for(int i =0;i<n;i++)
        {
            double avg= (arr[l]+arr[r])/2.0;
            ans= Math.min(avg,ans);
            l++;
            r--;
        }
        return ans;
    }
}
