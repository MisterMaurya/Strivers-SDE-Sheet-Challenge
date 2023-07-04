package codingninja;

// https://www.codingninjas.com/studio/problems/flood-fill-algorithm_8230806?challengeSlug=striver-sde-challenge
// 156. Flood Fill Algorithm
public class Solution156 {

    public static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int[][] floodFill(int[][] image, int x, int y, int newColor) {
        if (image[x][y] == newColor)
            return image;

        int n = image.length;
        int m = image[0].length;
        int oldColor = image[x][y];

        boolean[][] visited = new boolean[n][m];
        dfs(x, y, oldColor, newColor, image, visited, n, m);
        return image;
    }

    private static void dfs(int x, int y, int oldColor, int newColor, int[][] image, boolean[][] visited, int n, int m) {
        visited[x][y] = true;
        image[x][y] = newColor;
        for (int i = 0; i < 4; i++) {
            int dr = dir[i][0] + x;
            int dc = dir[i][1] + y;
            if (dr >= 0 && dc >= 0 && dr < n && dc < m && image[dr][dc] == oldColor) {
                dfs(dr, dc, oldColor, newColor, image, visited, n, m);
            }
        }
    }
}

