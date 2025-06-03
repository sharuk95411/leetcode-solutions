class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        
       HashMap<String,List<String>>h= new HashMap<>();
       
       for(int i=0;i<arr.length;i++)
       {

               char[] chars = arr[i].toCharArray();
        Arrays.sort(chars);
        String s = new String(chars);

        if(h.containsKey(s))
        {
            h.get(s).add(arr[i]);
        }
        else
        {
            List<String>l= new ArrayList<>();
             l.add(arr[i]);
             h.put(s,l);
        }
                 
       }
       List<List<String>>ans = new ArrayList<>();

         for (Map.Entry<String, List<String>> entry : h.entrySet()) {
            ans.add(entry.getValue());
         }
         return ans;
    }
}
