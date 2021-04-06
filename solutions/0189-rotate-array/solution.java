class Solution {
    public void rotate(int[] arr, int k) {
         k= k%arr.length; // ye line imp h when arr [1,2,3] k=4 and ans is arr[3,1,2] bcz yha k ki value 1 aygi arr ki length 3 h to 3 steps reverse krne pr whi arr ayga and 1 steps hme aur roatte krna hga but k ko modulo krne se only 1 times krna pdega .ye tb k liye h jb k>= arr.length. isme k wp steps h jitna hme rotate krna h na ki index no;
        
        int end= arr.length-k-1;
        int start=0;
        reverse(start,end,arr); // reverse the left half until <k
        start=arr.length-k;
        end= arr.length-1;
           reverse(start,end,arr);
            start=0;
        end= arr.length-1;
        reverse(start,end,arr);
    }
    static void reverse(int start,int end,int arr[])
        {
        while(start<end && start>=0)
        {
            int temp= arr[end];
            arr[end]= arr[start];
            arr[start]= temp;
            start++;
            end--;
        }
        }
}
