class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int lastIndex[]= new int[26];
        for(int i=0;i<s.length();i++)
        {
            lastIndex[s.charAt(i)-'a']=i;
        }
        int max=0;
       int  prev=-1;
        
        List<Integer>list= new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            int value= s.charAt(i)-'a';
            max= Math.max(max,lastIndex[value]);
            if(max==i)
            {
             list.add(max-prev);
                prev=max;
            }
        }
        
        return list;
    }
}
