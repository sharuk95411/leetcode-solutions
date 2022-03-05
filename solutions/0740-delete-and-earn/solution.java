class Solution {
    public int deleteAndEarn(int[] arr) {
     
        TreeMap<Integer,Integer>h= new TreeMap<>();
        
        int n= arr.length;
        
        for(int i=0;i<n;i++)
        {
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        
        int currSum=0;
            int prevSum=0;
        int prevKey=-1;
            
     
        for(int key : h.keySet())
        {
            int m= Math.max(currSum,prevSum);
            System.out.println(key);
            if(key-1!=prevKey)
            {
                currSum= key*h.get(key)+m;
                prevSum= m;
            }
            else
            {
                currSum=key*h.get(key)+prevSum;
                prevSum= m;
            }
            prevKey=key;
        }
        
        return Math.max(currSum,prevSum);
    }
}
