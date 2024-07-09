class Solution {
    List<Integer>ans= new ArrayList<>();
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer>h= new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),i);
        }
       System.out.println("freq of Q is " +h.get('q'));
        int i =0;
        while(i<s.length())
        {
            int index= h.get(s.charAt(i));
            if(index==i)
            {
                ans.add(1);
                i++;
            }
            else
            {
                String temp= s.substring(i,index+1);
                //  index=h.get(s.charAt(i));
                for(int j=0;j<temp.length();j++)
                {   
                    int tempIndex= h.get(temp.charAt(j));
                    if(tempIndex>index)
                    {
                        temp=s.substring(i,tempIndex+1);
                    }
                    index=Math.max(index,tempIndex);
                    
                }
                ans.add(index-i+1);
                i=index+1;
            }
        }
        return ans;

    }
}
