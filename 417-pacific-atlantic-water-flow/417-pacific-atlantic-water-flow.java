class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        Set<String> pacific = new HashSet<>();
        Set<String> atlantic = new HashSet<>();
        int rows = heights.length, cols = heights[0].length;
        for (int i = 0; i < cols; i++) {
            dfs(heights, 0, i, pacific, heights[0][i]);
            dfs(heights, rows-1, i, atlantic, heights[rows-1][i]);
        }
        for (int i = 0; i < rows; i++) {
            dfs(heights, i, 0, pacific, heights[i][0]);
            dfs(heights, i, cols-1, atlantic, heights[i][cols-1]);
        }
        pacific.retainAll(atlantic);
        for (String s : pacific) {
            String[] arr = s.split(",");
            List<Integer> a = new ArrayList<>();
            a.add(Integer.parseInt(arr[0]));
            a.add(Integer.parseInt(arr[1]));
            res.add(a);
        }
        return res;
    }

    private void dfs(int[][] grid, int i, int j, Set<String> visited, int prev) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] < prev || visited.contains(i + "," + j)) return;

        visited.add(i + "," + j);
        dfs(grid, i, j - 1, visited, grid[i][j]);
        dfs(grid, i, j + 1, visited, grid[i][j]);
        dfs(grid, i - 1, j, visited, grid[i][j]);
        dfs(grid, i + 1, j, visited, grid[i][j]);
    }
}
