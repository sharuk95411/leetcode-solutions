class Solution {
    public int splitArray(int[] arr, int m) {
        int n= arr.length;
         if(m>n) return -1;
        
        int l= arr[n-1];
        int ans=-1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int r= sum;
        
        while(l<=r)
        {
            int mid= l+(r-l)/2;
            if(isValid(arr,n,m,mid)==true)
            {
                ans=mid;
                r=mid-1;
            }
            else l= mid+1;
        }
    
        return ans;
    }
     public boolean isValid(int arr[],int n,int m,int pages)
        {
            int s=1;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]>pages) return false;
             
                 sum=sum+arr[i]; 
                if(sum>pages)
                {
                    s++;
                    sum=arr[i];
                    
                    if(s>m) return false;
                }
            
              
                
            }
            return true;
            
        }
}
