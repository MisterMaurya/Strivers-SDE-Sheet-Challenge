package codingninja;

/**
 * @description: [https://www.codingninjas.com/codestudio/problems/rotting-oranges_8230701?challengeSlug=striver-sde-challenge]
 * @author: Pawan Maurya
 */


import java.util.LinkedList;
import java.util.Queue;

public class Solution95 {


    public static final int[][] DIR = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int minTimeToRot(int[][] grid, int n, int m) {

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2)
                    queue.add(new int[]{i, j, 0});
            }
        }

        int minTimeToRot = 0;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            minTimeToRot = Math.max(poll[2], minTimeToRot);

            for (int i = 0; i < 4; i++) {
                int dr = DIR[i][0] + poll[0];
                int dc = DIR[i][1] + poll[1];
                if (validRange(dr, dc, grid, n, m, visited)) {
                    visited[dr][dc] = true;
                    queue.add(new int[]{dr, dc, poll[2] + 1});
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j])
                    return -1;
            }
        }
        return minTimeToRot;
    }

    private static boolean validRange(int dr, int dc, int[][] grid, int n, int m, boolean[][] visited) {
        return dr >= 0 && dc >= 0 && dr < n && dc < m && grid[dr][dc] == 1 && !visited[dr][dc];

    }
}