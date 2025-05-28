class Solution {

   Integer memo[];
    public int rob(int[] arr) {
        
        memo= new Integer[arr.length+1];
        return A(arr,0);
    }

    public int A(int arr[],int i)
    {

        if(i>=arr.length) return 0;
        else if(memo[i]!=null) return memo[i];

        int a= arr[i]+A(arr,i+2);
        int b = A(arr,i+1);

        return  memo[i]=Math.max(a,b);
    }
}
