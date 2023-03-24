class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        System.out.println("LENGTH IS "+m);
      int i=m-1;
      int j= m+n-1;
      int k=n-1;

      while(k>=0 && i>=0)
      {
          if(arr1[i]>arr2[k])
          {
              arr1[j]= arr1[i];
              i--;
              j--;
          }
          else 
          {
              arr1[j]= arr2[k];
              j--;
              k--;
          }
      }
      while(k>=0)
      {
          arr1[j]=arr2[k];
          j--;
          k--;
      }

    }
}
