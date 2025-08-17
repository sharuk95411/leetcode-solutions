class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        
        HashMap<String,List<String>>h= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            char[] chars = arr[i].toCharArray();

        // Sort the char array
        Arrays.sort(chars);

        // Convert back to string
        String key = new String(chars);
          
          if(h.containsKey(key))
          {
                List<String>list= h.get(key);
                list.add(arr[i]);
                h.put(key,list);

          }
          else
          {

            List<String>list= new ArrayList<>();
            list.add(arr[i]);
            h.put(key,list);
          }

        }

    List<List<String>>ans= new ArrayList<>();
    for(List<String>inner:h.values())
    {
        System.out.println(inner);
        ans.add(new ArrayList<>(inner));
    }
    return ans;
    }
    
}
