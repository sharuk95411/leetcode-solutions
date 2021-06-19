// Logic TECh DOSE
class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>>result= new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++)
        {
            //if(i>0 && arr[i]==arr[i-1]) continue; 
            for(int j=i+1;j<arr.length-2;j++)
            {
               // if(j>i+1 && arr[j]==arr[j-1]) continue;
                
                int left=j+1;
                int right= arr.length-1;
                while(left<right)
                {
                    int sum= arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target)
                    {  
                        List<Integer>list= new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[left]);
                        list.add(arr[right]);
                        if(result.contains(list)==false)
                        result.add(list);
                        left++;
                        }
                        else if(sum>target)right--;
                        else left++;
                        
                        
                }
            }
        }
    
      
    
    
        return result;
        
    }
}
