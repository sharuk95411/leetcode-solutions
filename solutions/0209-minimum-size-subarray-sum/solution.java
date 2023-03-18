class Solution {
    public int minSubArrayLen(int s, int[] a) {
  
  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
  
  while (j < a.length) {
    sum = sum+a[j];
    while (sum >= s) {
      min = Math.min(min, j - i+1);
      sum =sum- a[i];
      i++;
    }
    j++;
  }
  
  return min == Integer.MAX_VALUE ? 0 : min;
    }
}
