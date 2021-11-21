class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res= new ArrayList<>();
        int[] last= new int[26];
        int len=S.length();
        char[] sc= S.toCharArray();
        for(int i=0;i<len;i++){
            last[sc[i]-'a']=i;
        }
        int start=-1,end=-1;
        for(int i=0;i<len;i++){
            if(start==-1) start=i;
            end= Math.max(end,last[sc[i]-'a']);
            if(end==i){ res.add(end-start+1);
                      start=-1;
                      }
        }
        return res;
    }
}
