class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        String s= Integer.toString(low);
        // sbse hme hme base number set krna h jiski help se ham age number pta lgayge.
        
        List<Integer>l= new ArrayList<>();
        
        if(high<=11) return l;
        
        int arr[]= {12,23,34,45,56,67,78,89,
                    123,234,345,456,567,678,789,
                      1234,2345,3456,4567,5678,6789,
                     12345,23456,34567,45678,56789,
                    123456,234567,345678,456789,
                    1234567,2345678,3456789,
                    12345678,23456789,
                    123456789           
                   };
        
        
        int base= arr[0];
        
        int i=0;
        while(i<arr.length && arr[i]<=high)
        {
            if(low>arr[i])
            {
                i++;
            }
            else if(arr[i]>=low)
            {
                l.add(arr[i]);
                i++;
            }
        }
         
        
        
        
        
        
        
        
        
        
        
        
        
        return l;
        
    }
}
