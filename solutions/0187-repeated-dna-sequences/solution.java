class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String>l= new ArrayList<>();
        if(s.length()<10)return l;
        HashMap<String,Integer>h= new HashMap<>();
        int i=0;
        int j=10;
        while(i<s.length()-9)
        {
         String subseq= s.substring(i,i+10);
            h.put(subseq,h.getOrDefault(subseq,0)+1);
            if(h.get(subseq)==2) l.add(subseq);
            i++;
        
        }
        return l;
    }
}
