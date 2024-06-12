class Solution {
    public void moveZeroes(int[] arr) {
        
        int i=0;
        while(i<arr.length && arr[i]!=0)
        {
            i++;
        }
        
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]!=0)
            {
                arr[i]=arr[j];
                arr[j]=0;
                i++;
            }
        }
        
    }
}
