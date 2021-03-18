class Solution {
    public int numIdenticalPairs(int[] arr) {
         
        HashMap<Integer,Integer>h= new HashMap<>();
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            Integer a= h.get(arr[i]);
            if(a==null)
            {
                h.put(arr[i],0);
            }
            else
            {
                h.put(arr[i],a+1);
                count= count+a+1;
            }
        }
        return count;
    }
}
