class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            String s1=strs[i];
            char[] arr=s1.toCharArray();
            Arrays.sort(arr);
            s1=new String(arr);
            
            if(map.containsKey(s1)){
                map.get(s1).add(strs[i]); 
            }else{
                map.put(s1,new ArrayList<>());
                  map.get(s1).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
