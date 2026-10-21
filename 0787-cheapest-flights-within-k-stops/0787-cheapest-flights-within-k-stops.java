
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] flight : flights) {
            adj.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        int[][] dist = new int[n][k + 2];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src, 0});
        dist[src][0] = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int cost = curr[0], city = curr[1], edge = curr[2];

            if (city == dst) return cost;
            if (edge == k + 1) continue;
            if (cost > dist[city][edge]) continue;

            for (int[] next : adj.get(city)) {
                int newc = next[0], price = next[1];

                if (cost + price < dist[newc][edge + 1]) {
                    dist[newc][edge + 1] = cost + price;
                    pq.offer(new int[]{cost + price, newc, edge + 1});
                }
            }
        }
        return -1;
    }
}
