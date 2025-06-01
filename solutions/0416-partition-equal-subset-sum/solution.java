class Solution {
   
   Map<String,Boolean>h;
    public boolean canPartition(int[] arr) {
        
        int sum=0;
        for(int a:arr)
        {
            sum= sum+a;
        }
        if(sum%2!=0) return false;
         h = new HashMap<String,Boolean>();
           return A(0,arr,sum/2);
           
    }
    
      public boolean A(int i,int arr[],int sum)
      {
                 if(i>=arr.length || sum<0) return false;
                 
                 else if(sum==0) return true;

                 String key=i+"|"+sum;
                 if(h.containsKey(key)) return h.get(key);
            
             Boolean b= A(i+1,arr,sum-arr[i])||A(i+1,arr,sum);
                 h.put(key,b);
                 return b;
      }
}
