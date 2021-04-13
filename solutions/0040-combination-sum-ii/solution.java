// Logic GoodTeacher
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>>l1 = new ArrayList<>();
        
        if (candidates == null || candidates.length == 0) {
            return l1;
        }
        
        Arrays.sort(candidates);
        
        List<Integer> l2 = new ArrayList<>();
        toFindCombinationsToTarget(candidates, l1, l2, 0, target);
        
        return l1;
        
    }
       private void toFindCombinationsToTarget(int[] candidates, List<List<Integer>> l1, List<Integer> l2, int startIndex, int target) {
        if (target == 0) {
            l1.add(new ArrayList<>(l2));
            return;
        }
        
        for (int i = startIndex; i < candidates.length; i++) {
            if (i != startIndex && candidates[i] == candidates[i - 1]) continue;
            
            if (candidates[i] > target) break;       
            
            l2.add(candidates[i]);
            toFindCombinationsToTarget(candidates, l1, l2, i + 1, target - candidates[i]);
            l2.remove(l2.size() - 1); // Backtracking
        }
        
    }
}
