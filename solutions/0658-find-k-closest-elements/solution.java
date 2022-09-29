class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>(k);
            int index = Arrays.binarySearch(arr,x);
            if(index < 0) index = -(index + 1);
            boolean left = true, right = true;
            int l = index-1, r = index;
            
            if(index == 0) left = false;
            if(index == arr.length) right = false;

            while (res.size() < k) {
                if(left && right) {
                    int tempLeft = arr[l], tempRight = arr[r];
                    int a = Math.abs(tempLeft - x), b = Math.abs(tempRight - x);
                    if(a < b) {
                        res.add(tempLeft);
                        l--;
                    }
                    else if(b < a) {
                        res.add(tempRight);
                        r++;
                    }
                    else {
                        res.add(Math.min(tempLeft, tempRight));
                        l--;
                    }

                    if(l < 0) left = false;
                    if(r >= arr.length) right = false;
                    continue;
                }
                if(left) {
                    res.add(arr[l--]);
                    if(l < 0) left = false;
                    continue;
                }
                if(right) {
                    res.add(arr[r++]);
                    if(r >= arr.length) right = false;
                }
            }
            Collections.sort(res); // wanting to reduce this O(K * log(k)) to any complexity O(k)
            return res;
    }
}
