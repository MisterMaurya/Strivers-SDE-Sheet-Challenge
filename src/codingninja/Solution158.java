package codingninja;

import java.util.ArrayList;
import java.util.Collections;

// https://www.codingninjas.com/studio/problems/dfs-traversal_8230690?challengeSlug=striver-sde-challenge
// 158. DFS Traversal

public class Solution158 {
    public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> edges) {
        ArrayList<ArrayList<Integer>> dfs = new ArrayList<>();
        boolean[] visited = new boolean[v];

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int w = edge.get(1);
            adjList.get(u).add(w);
            adjList.get(w).add(u);
        }
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                ArrayList<Integer> ds = new ArrayList<>();
                dfs(adjList, visited, i, ds);
                Collections.sort(ds);
                dfs.add(ds);
            }
        }
        return dfs;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> edges, boolean[] visited, int node, ArrayList<Integer> ds) {
        visited[node] = true;
        ds.add(node);

        for (int adj : edges.get(node)) {
            if (!visited[adj]) {
                dfs(edges, visited, adj, ds);
            }
        }
    }

}