class Solution {
    public void moveZeroes(int[] arr) {
     
        int temp=0;
        int curr=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0 && arr[i+1]==0)
            {
                continue;
            }
            if(arr[i]==0 && arr[i+1]!=0)
            {
                temp= arr[i+1];
                arr[i+1]= arr[curr];
                arr[curr]= temp;
                
            }
            curr++;
        
        }

    }
}
