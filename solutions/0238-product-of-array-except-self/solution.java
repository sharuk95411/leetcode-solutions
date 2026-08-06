class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int left[]= new int[arr.length];
        int right[]= new int[arr.length];
        int ans[]= new int[arr.length];

       int temp=arr[0];
       left[0]= 1;
       for(int i=1;i<arr.length;i++)
       {
          left[i]= temp;
          temp=temp*arr[i];
       }

    System.out.println("left Array "+Arrays.toString(left));
       temp=arr[arr.length-1];
       right[arr.length-1]=1;
       for(int i=arr.length-2;i>=0;i--)
       {
             right[i]= temp;
             temp=temp*arr[i];
       }

        System.out.println("Right Array "+Arrays.toString(right));

       for(int i=0;i<arr.length;i++)
       {
        ans[i]= left[i]*right[i];
       }
       return ans;

    }
}
