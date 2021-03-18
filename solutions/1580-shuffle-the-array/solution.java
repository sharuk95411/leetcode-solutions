class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]= new int [nums.length];
        int j=0;
        int temp= nums.length/2;
        for(int i=0;i<temp;i++)
        {
            arr[j]= nums[i];
            arr[j+1]= nums[temp+i];
            j=j+2;
        }
        return arr;
        
    }
}
