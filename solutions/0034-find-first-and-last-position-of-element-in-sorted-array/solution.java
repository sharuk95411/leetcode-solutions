class Solution {
    public int[] searchRange(int[] arr, int target) {
        
       int result[]= new int[2];
       result[0]= startIndex(arr,target);
       result[1]= endIndex(arr,target);
        return result;
        
    }
       static int startIndex(int arr[],int target)
   {
       int index=-1;
       int start=0;
       int end= arr.length-1;
       while(start<=end)
       {
           int mid= start+ (end-start)/2;
           if(arr[mid]>=target)
           {
               end=mid-1;
           }
           else
           {
            start= mid+1;   
           }
           if(arr[mid]==target)
           {
               index=mid;
           }
       }
    
       return index;
   }
     static int endIndex(int arr[],int target)
   {
       int index=-1;
       int start=0;
       int end= arr.length-1;
       while(start<=end)
       {
           int mid= start+ (end-start)/2;
           if(arr[mid]<=target)
           {
               start=mid+1;
           }
           else
           {
            end= mid-1;   
           }
       
       if(arr[mid]==target)
       {
           index= mid;
       }
       }
       return index;
   }
}
