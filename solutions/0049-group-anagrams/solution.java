class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        HashMap<String,List<String>>h= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
               char ch[]= arr[i].toCharArray();
               Arrays.sort(ch);
              String s = new String(ch);  
              
               if(h.containsKey(s))
               {
                   h.get(s).add(arr[i]);
               }
               else
               {
                   h.put(s,new ArrayList<>());
                   h.get(s).add(arr[i]);
               }
        }

        List<List<String>>outer= new ArrayList<>();
     for (Map.Entry<String,List<String>> m : h.entrySet())
{

      List<String>inner = m.getValue();
      System.out.println(inner);
      outer.add(new ArrayList<>(inner));
}
return outer;

    }
}
