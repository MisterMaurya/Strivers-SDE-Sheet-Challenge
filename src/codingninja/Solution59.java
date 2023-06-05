package codingninja;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/rat-in-a-maze-all-paths_8230705?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */

import java.util.ArrayList;

public class Solution59 {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] ds = new int[n][n];
        if (maze[0][0] != 1)
            return ans;
        ds[0][0] = 1;
        solve(0, 0, maze, ds, n, ans);
        return ans;
    }

    static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private static void solve(int i, int j, int[][] maze, int[][] ds,
                              int n, ArrayList<ArrayList<Integer>> ans) {
        if (i == n - 1 && j == n - 1) {
            ArrayList<Integer> path = new ArrayList<>();
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    path.add(ds[k][l]);
                }
            }
            ans.add(path);
            return;
        }

        for (int k = 0; k < 4; k++) {
            int dr = i + dir[k][0];
            int dc = j + dir[k][1];
            if (inRange(dr, dc, n, maze) && ds[dr][dc] != 1) {
                ds[dr][dc] = 1;
                solve(dr, dc, maze, ds, n, ans);
                ds[dr][dc] = 0;
            }
        }
    }

    private static boolean inRange(int dr, int dc, int n, int[][] maze) {
        return dr >= 0 && dc >= 0 && dr < n && dc < n && maze[dr][dc] == 1;
    }
}