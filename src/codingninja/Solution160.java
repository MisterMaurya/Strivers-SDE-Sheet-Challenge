package codingninja;

import java.util.ArrayList;

// 160. Cycle Detection In Undirected Graph
// https://www.codingninjas.com/studio/problems/cycle-detection-in-undirected-graph_8230798?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class Solution160 {

    public static String cycleDetection(int[][] edges, int n, int m) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            //System.out.println(edge.length);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean visited[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            if (!visited[i]) {
                if (dfs(visited, adj, i, -1))
                    return "Yes";
            }
        }
        return "No";
    }

    static boolean dfs(boolean visited[], ArrayList<ArrayList<Integer>> adj, int node, int parent) {
        visited[node] = true;
        for (int x : adj.get(node)) {
            if (!visited[x]) {
                return dfs(visited, adj, x, node);
            } else if (parent != x && parent != -1) {
                return true;
            }

        }
        return false;
    }
}