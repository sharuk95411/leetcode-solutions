class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>list= new ArrayList<>();
        HashMap<Character,Integer>h= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),i);
        }
        int max=0;
        int prev=-1;

        for(int i=0;i<s.length();i++)
        {
            int posn= h.get(s.charAt(i));
            if(posn>max) max=posn;
            if(i==max)
            {
                list.add(max-prev);
                prev=max;
                max=0;
                
            }
        }

        return list;
    }
}
