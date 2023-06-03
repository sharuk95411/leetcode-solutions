class Solution {

    public int[] asteroidCollision(int[] arr) {
        
        int n= arr.length;
              for(int i=0;i<n;i++)
              {
                  if(arr[i]<0)
                  {
                      int j=i-1;
                      while(j>=0)
                      {
                         if(arr[j]<0 && arr[i]<0) break;
                        else if(Math.abs(arr[i])==Math.abs(arr[j]))
                          {
                              arr[i]=0;
                              arr[j]=0;
                              break;
                          }
                          else if(Math.abs(arr[j])>Math.abs(arr[i]))
                          {
                              arr[i]=0;
                              break;
                          }
                          else
                          {
                              arr[j]=0;
                              j--;
                          }
                      }
                  }
              }
              int count=0;
              for(int a :arr)
              {
                  if(a!=0) count++;
                  System.out.println(a);
              }
              int ans[]= new int[count];
              count=0;
              int i=0;
              while(count<ans.length)
              {
                  if(arr[i]!=0)
                  {
                          ans[count]=arr[i];
                          count++;
                  }
                  i++;
              }
              return ans;
    }
}
