class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        
     String str = arr[0];

      char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String sorted = new String(ch);
       HashMap<String, List<String>> h = new HashMap<>();
         List<String>l1= new ArrayList<>();
         l1.add(arr[0]);

         h.put(sorted,l1);

         for(int i=1;i<arr.length;i++)
         {
                   str = arr[i];

           ch = str.toCharArray();
            Arrays.sort(ch);

             sorted = new String(ch);

             if(h.containsKey(sorted))
             {
                h.get(sorted).add(str);
             }
             else
             {
                 List<String>l2= new ArrayList<>();
                 l2.add(str);
                 h.put(sorted,l2);
             }
         }
         return new ArrayList<>(h.values());
    
    }
}
