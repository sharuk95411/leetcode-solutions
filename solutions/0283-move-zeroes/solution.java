class Solution {
    public void moveZeroes(int[] arr) {
        
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0) count++;
            else if(count>0)
            {
                     arr[i-count]=arr[i];
                      arr[i]=0;   
            }
        }
    }
}
