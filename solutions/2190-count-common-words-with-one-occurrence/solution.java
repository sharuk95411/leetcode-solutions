class Solution {
    public int countWords(String[] w1, String[] w2) {
        
        HashMap<String,Integer>h1= new HashMap<>();
        for(int i=0;i<w1.length;i++)
        {
            h1.put(w1[i],h1.getOrDefault(w1[i],0)+1);
        }
        HashMap<String,Integer>h2= new HashMap<>();
        for(int i=0;i<w2.length;i++)
        {
            h2.put(w2[i],h2.getOrDefault(w2[i],0)+1);
        }
        
        int count=0;
        for(int i=0;i<w2.length;i++)
        {
            if( h1.get(w2[i])!=null &&(h2.get(w2[i])==1 && h1.get(w2[i])==1)) count++;
        }
        return count;
        
    }
}
