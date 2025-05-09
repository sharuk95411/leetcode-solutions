class Solution {

    class Point {
        TreeNode root;
        int x;
        int y;

        public Point(TreeNode root, int x, int y) {
            this.root = root;
            this.x = x;
            this.y = y;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;

        Map<Integer, PriorityQueue<Point>> map = new HashMap<>();
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(root, 0, 0));

        PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> {
            if (a.y != b.y) {
                return a.y - b.y; // Sort by y (ascending)
            } else {
                return a.root.val - b.root.val; // Sort by root.val (ascending) if y is the same
            }
        });

        int minIdx = 0;
        int maxIdx = 0;

        while (!queue.isEmpty()) {

            int size= queue.size();
            while(size>0)
            {
            Point point = queue.poll();
            root = point.root;

            map.putIfAbsent(point.x, new PriorityQueue<>(pq));

            map.get(point.x).add(point);

            // Update min and max indices
            minIdx = Math.min(minIdx, point.x);
            maxIdx = Math.max(maxIdx, point.x);

            if (root.left != null) {
                queue.add(new Point(root.left, point.x - 1, point.y + 1));
            }
            if (root.right != null) {
                queue.add(new Point(root.right, point.x + 1, point.y + 1));
            }
            size--;
            }
           
        }

        // Build the result from the map
        for (int i = minIdx; i <= maxIdx; i++) {
            PriorityQueue<Point> pqq = map.get(i);
            List<Integer> list = new ArrayList<>();
            while (!pqq.isEmpty()) {
                list.add(pqq.poll().root.val);
            }
            res.add(list);
        }

        return res;
    }
}
