class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;
        
        int max_no=Integer.MIN_VALUE;
        int index= 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=max_no)
            {
                max_no= arr[i];
                index=i;
            }
        }
        if(index==arr.length-1) return false;
        if(index==0) return false;
        
        // Check left to i 
        for(int i=0;i<index;i++)
        {
            if(arr[i]>=arr[i+1]) return false;
        }
        for(int i=arr.length-1;i>index;i--)
        {
            if(arr[i]>=arr[i-1]) return false;
        }
        
        return true;
    }
}
