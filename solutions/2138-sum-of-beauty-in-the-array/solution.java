class Solution {
    public int sumOfBeauties(int[] arr) {
        
        int ans=0;
        int n= arr.length;
        int min_on_right[]= new int[n];
        
        min_on_right[n-1]= arr[n-1];
        for(int i=n-2;i>=2;i--)
        {
            min_on_right[i]= Math.min(min_on_right[i+1],arr[i]);
        }
        int max_on_left=arr[0];
        
        for(int i=1;i<=n-2;i++)
        {
            if(arr[i]>max_on_left && arr[i]<min_on_right[i+1]) ans+=2;
            else if(arr[i]>arr[i-1] && arr[i+1]>arr[i]) ans+=1;
            max_on_left= Math.max(max_on_left,arr[i]);
        }
        return ans;
    }
}
