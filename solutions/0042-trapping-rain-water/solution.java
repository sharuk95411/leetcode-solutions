class Solution {
    public int trap(int[] arr) {
       if(arr.length<3) return 0;
   /*     int left_max=Integer.MIN_VALUE;
        int right_max= Integer.MIN_VALUE;
        int trapped_water=0;
        for(int i=1;i<arr.length-1;i++)
        {
            int j=0;
            while(j<i)
            {
                left_max= Math.max(left_max,arr[j]);
                j++;
                
            }
           
            j++;
            while(j<arr.length)
            {
                right_max= Math.max(right_max,arr[j]);
                j++;
            }
            int a= Math.min(left_max,right_max);
            if(a>arr[i])
            {
            trapped_water= trapped_water+(a-arr[i]);
            }
            left_max=-1;
            right_max=-1;
                
        }
        return trapped_water;*/
        
        int trapped_water=0;
        int left_max= arr[0];
        int right_max= arr[arr.length-1];
        int left= 1;
            int right= arr.length-2;
        while(left<=right)
        {
            if(right_max>left_max)
            {
                if(left_max>arr[left])trapped_water= trapped_water+(left_max-arr[left]);
                left_max=Math.max(left_max,arr[left]);
                left++;
                
            }
            else
            {
                if(right_max>arr[right]) trapped_water= trapped_water+(right_max-arr[right]);
                right_max= Math.max(right_max,arr[right]);
                    right--;
            }
        }
        return trapped_water;
    }
}
