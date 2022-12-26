class Solution {
    public int findKthLargest(int[] arr, int k) {
      Arrays.sort(arr);
int i=0;

        for(int j=arr.length-1;j>=0;j--)
    {
        i++;
        if(i==k) return arr[j];
    }
      return 5;
    }

  
}
