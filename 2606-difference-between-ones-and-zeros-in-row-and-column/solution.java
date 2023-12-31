class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        
        int[] row = new int[n];
        int[] col = new int[m];

        int[][] diff = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 1) {
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                diff[i][j] = row[i] + col[j] - (n-row[i]) - (m - col[j]);
            }
        }
        return diff;
    }
}
