package codingninja;

// 163. Find Number Of Islands
// https://www.codingninjas.com/studio/problems/find-number-of-islands_8230692?challengeSlug=striver-sde-challenge
public class Solution163 {
    public static int getTotalIslands(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;
        int ans = 0;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && mat[i][j] == 1) {
                    ans++;
                    dfs(i, j, visited, mat, n, m);
                }
            }
        }
        return ans;
    }

    private static void dfs(int i, int j, boolean[][] visited, int[][] mat, int n, int m) {
        visited[i][j] = true;
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                int dr = i + k;
                int dc = j + l;
                if (dr >= 0 && dc >= 0 && dr < n && dc < m && !visited[dr][dc] && mat[dr][dc] == 1) {
                    dfs(dr, dc, visited, mat, n, m);
                }
            }
        }
    }
}