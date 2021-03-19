class Solution {
    public int sumOfUnique(int[] arr) {
        int sum=0;
        HashMap<Integer,Integer>h= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.get(arr[i])==null)
            {
                h.put(arr[i],1);
            }
            else
            {
                int m=h.get(arr[i]);
                h.put(arr[i],m+1);
            }
        }
        for (Map.Entry obj : h.entrySet()) { 
            if((int)obj.getValue()==1)
            {
                sum =sum+(int)obj.getKey();
            }
            
        }
        return sum;
        
    }
}
