class Solution {
    // Logic-Tech Dose
    // TC is Klog(n)
    // Hint= Max Heap ki help se hga 
    public int findKthLargest(int[] arr, int k) {
        int n= arr.length;
        int ans=0;
         for(int i=n/2-1;i>=0;i--)
        heapify(arr,i,n);
        
        for(int i=0;i<k;i++)
        {
        ans=arr[0];
        arr[0]=arr[n-1];
        n--;
        heapify(arr,0,n);
        }
        return ans;
    }
     public void heapify(int a[],int i,int n)
    {
        int max=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && a[l]>a[max])
        max=l;
        if(r<n && a[r]>a[max])
        max=r;
        if(i!=max)
        {
            int swap=a[i];
            a[i]=a[max];
            a[max]=swap;
            heapify(a,max,n);
        }
    }
}
