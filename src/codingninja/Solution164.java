package codingninja;

import java.util.ArrayList;

// Check Bipartite Graph
// https://www.codingninjas.com/studio/problems/check-bipartite-graph_8230761?challengeSlug=striver-sde-challenge&leftPanelTab=0
public class Solution164 {

    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.size(); i++) {
            for (int j = 0; j < edges.get(i).size(); j++) {
                if (edges.get(i).get(j) == 1) {
                    adjList.get(i).add(j);
                }
            }
        }
        int[] visited = new int[edges.size()];
        return dfs(0, visited, 1, adjList);
    }


    public static boolean dfs(int node, int[] visited, int color,
                              ArrayList<ArrayList<Integer>> adjList) {
        visited[node] = color;
        for (int add : adjList.get(node)) {
            if (visited[add] == 0) {
                visited[node] = 1 - color;
                if (!dfs(add, visited, 1 - color, adjList))
                    return false;
            } else if (visited[add] == color) {
                return false;
            }
        }
        return true;
    }
}