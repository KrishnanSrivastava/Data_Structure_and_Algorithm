class Pair {
    int node, cost;

    Pair(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Queue<int[]> que = new LinkedList<>();
        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] i : flights) {
            Pair pr = new Pair(i[1], i[2]);
            adj.get(i[0]).add(pr);
        }
        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);

        int[] first = { 0, src, 0 };
        que.add(first);
        while (!que.isEmpty()) {
            int[] ele = que.poll();
            int node = ele[1];
            int d = ele[2];
            if (ele[0] > k + 1)
                continue;
            
            if (node == dst){
                dist[node] = Math.min(dist[node], d);
                continue;
            }
            if (dist[node] < d){
                continue;
            } else dist[node] = d;
          
            for (Pair p : adj.get(node)) {
                int[] arr = { ele[0] + 1, p.node, p.cost + d };
                que.add(arr);
            }
        }
        return (dist[dst]== Integer.MAX_VALUE) ? -1 : dist[dst];
    }
}