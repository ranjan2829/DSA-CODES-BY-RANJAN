class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        boolean[][] visited = new boolean[row][col];
        int originalColor = image[sr][sc];

        dfs(image, sr, sc, newColor, originalColor, visited);

        return image;
    }

    private void dfs(int[][] image, int sr, int sc, int newColor, int originalColor, boolean[][] visited) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != originalColor) {
            return;
        }

        // Mark the current cell as visited and update its color
        visited[sr][sc] = true;
        image[sr][sc] = newColor;

        // Explore neighboring cells in all four directions
        dfs(image, sr + 1, sc, newColor, originalColor, visited);
        dfs(image, sr - 1, sc, newColor, originalColor, visited);
        dfs(image, sr, sc + 1, newColor, originalColor, visited);
        dfs(image, sr, sc - 1, newColor, originalColor, visited);
    }
}
