import java.util.HashMap;
import java.util.Map;

class Solution {
    int profit = 0;
    Map<String, Integer> memo = new HashMap<>();

    public int maxProfit(int[] arr) {
        profit = 0;
        memo.clear(); // Clear memoization for fresh calculations
        return A(arr, 1, arr[0]);
    }

    public int A(int arr[], int index, int buy) {
        if (index >= arr.length) return 0;

        String key = index + "," + buy;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int result;
        if (buy > arr[index]) {
            result = A(arr, index + 1, arr[index]);
        } else if (buy < 0) {
            result = A(arr, index + 1, arr[index]);
        } else if (arr[index] >= buy) {
            int take = arr[index] - buy + A(arr, index + 1, -1);
            int skip = A(arr, index + 1, buy);
            result = Math.max(take, skip);
            profit = Math.max(profit, result);
        } else {
            result = profit;
        }

        memo.put(key, result);
        return result;
    }
}

