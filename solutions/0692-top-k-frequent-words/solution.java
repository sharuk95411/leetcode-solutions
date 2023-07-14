class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for(String word : words) wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        
        PriorityQueue<String> minHeap = new PriorityQueue<>((s1, s2) -> {
            int s1Count = wordCounts.get(s1);
            int s2Count = wordCounts.get(s2);
            
            if(s1Count>s2Count)
            {
                 return 1;
            }
            else if(s1Count<s2Count)
            {
                      return -1;
            }
            else 
           return s2.compareTo(s1);// Compare the Strings in lexiographical Order

        });
        
        for(String word : wordCounts.keySet()) {
            minHeap.add(word);
            
            if(minHeap.size() > k) minHeap.poll(); 
        }
        
        // LinkedList<String> toReturn = new LinkedList<>();
        List<String>ans= new ArrayList<>();
        while(!minHeap.isEmpty()) ans.add(0,minHeap.poll());
        
        return ans;
    }
    
}
