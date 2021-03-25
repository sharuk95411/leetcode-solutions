
class Solution {
    public int[] productExceptSelf(int[] arr) {
    int a[]= new int[arr.length];
    a[0]= 1; 

    for(int i=1;i<arr.length;i++)
    {
        a[i]= arr[i-1]*a[i-1]; // traverse from left to right and construct "a" array of product of elements of all the left elements arr arrays but isme a[0] 1 lia gya h ye yd rkhna
    }
      // System.out.println(Arrays.toString(a));
      int temp=1;
      for(int i=arr.length-1;i>=0;i--)
      {
          a[i]= a[i]*temp;
          temp= temp*arr[i];
      }
        return a;
    }
}
