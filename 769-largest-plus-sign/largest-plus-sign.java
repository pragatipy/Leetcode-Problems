import java.util.Arrays;

class Solution {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for (int[] row : grid) {
            Arrays.fill(row, n);
        }

        for (int[] mine : mines) {
            grid[mine[0]][mine[1]] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0, l = 0; j < n; j++) {
                l = (grid[i][j] == 0) ? 0 : l + 1;
                grid[i][j] = Math.min(grid[i][j], l);
            }
            for (int k = n - 1, r = 0; k >= 0; k--) {
                r = (grid[i][k] == 0) ? 0 : r + 1;
                grid[i][k] = Math.min(grid[i][k], r);
            }
            for (int j = 0, u = 0; j < n; j++) {
                u = (grid[j][i] == 0) ? 0 : u + 1;
                grid[j][i] = Math.min(grid[j][i], u);
            }
            for (int k = n - 1, d = 0; k >= 0; k--) {
                d = (grid[k][i] == 0) ? 0 : d + 1;
                grid[k][i] = Math.min(grid[k][i], d);
            }
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, grid[i][j]);
            }
        }

        return ans;
    }
}