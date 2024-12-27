class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nextSmaller = new int[n];
        int[] prevSmaller = new int[n];

        // Initialize nextSmaller and prevSmaller arrays

        // Compute Previous Smaller Element (PSE) using a stack
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                prevSmaller[i] = stack.peek();
            }
            else prevSmaller[i]= -1;
            stack.push(i);
        }

        // Compute Next Smaller Element (NSE) using a stack
        stack.clear(); // Reuse the stack
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                nextSmaller[i] = stack.peek();
            }
            else nextSmaller[i]=n;
            stack.push(i);
        }

        // Calculate the largest rectangle area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nextSmaller[i] - prevSmaller[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
