class Solution {
    public int[] replaceElements(int[] arr) {
        int max=-1,a;
        for(int i= arr.length-1;i>=0;i--)
        {
            a=arr[i];
            arr[i]= max;
            max= Math.max(a,max);
            
        }
        return arr;
    }
}
