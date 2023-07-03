package codingninja;

import java.util.*;
import java.io.*;

// https://www.codingninjas.com/studio/problems/topological-sort_8230784?challengeSlug=striver-sde-challenge
// 162. Topological Sort
public class Solution162 {
    public static ArrayList<Integer> topologicalSort(
            ArrayList<ArrayList<Integer>> edges, int v, int e) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int x = edges.get(i).get(0);
            int y = edges.get(i).get(1);
            adjList.get(x).add(y);
        }


        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(visited, stack, i, adjList);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }

        return ans;
    }

    public static void dfs(boolean[] visited, Stack<Integer> stack, int node, ArrayList<ArrayList<Integer>> adjList) {
        visited[node] = true;
        for (int n : adjList.get(node)) {
            if (!visited[n]) {
                dfs(visited, stack, n, adjList);
            }
        }
        stack.push(node);

    }
}
