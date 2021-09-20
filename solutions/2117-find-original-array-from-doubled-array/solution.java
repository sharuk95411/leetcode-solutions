class Solution {
    public int[] findOriginalArray(int[] changed) {
        
        if(changed.length%2!=0) return new int[0];
        int arr[]= new int[changed.length/2];
        int i=0;
        Map<Integer,Integer>m= new TreeMap<>();
        for(int a:changed)
        {
            m.put(a,m.getOrDefault(a,0)+1);
        }
        for(int key:m.keySet())
        {
            if(m.get(key)>m.getOrDefault(key+key,0))
                return new int[0];
            for(int j=0;j<m.get(key);j++)
            {
                arr[i++]= key;
                m.put(key+key,m.getOrDefault(key+key,0)-1);
            }
        }
        return arr;
        
    }
}
