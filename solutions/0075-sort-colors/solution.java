class Solution {
    public void sortColors(int[] arr) {
        int i=0;
        int j= arr.length-1;

        for(int k=0;k<arr.length;k++)
        {
             if(arr[k]==0 && i<=k)
             {
                arr[k]=arr[i];
                arr[i]=0;
                i++;
                k--;
             }
             else if (arr[k]==2 && j>k)
             {
                arr[k]=arr[j];
                arr[j]=2;
                j--;
                k--;
             }
        }
    }
}
