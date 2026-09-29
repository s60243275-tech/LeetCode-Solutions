class XMatrix {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                boolean diagonal = (i == j) || (i + j == n - 1);
                if (diagonal && grid[i][j] == 0) return false;
                if (!diagonal && grid[i][j] != 0) return false;
            }
        return true;
    }
}