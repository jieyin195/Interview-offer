package 揭尹.三刷算法题.No13_机器人的运动范围;

public class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(m, n, 0, 0, visited, k);
    }

    private int dfs(int m, int n, int i, int j, boolean[][] visited, int k) {
        if (i < 0 || j < 0 || i >= m || j >= n || visited[i][j] || numSum(i) + numSum(j) > k) {
            return 0;
        }
        visited[i][j] = true;
        return 1+dfs(m,n,i-1,j,visited,k)+dfs(m,n,i+1,j,visited,k)+dfs(m,n,i,j-1,visited,k)+dfs(m,n,i,j+1,visited,k);
    }

    private int numSum(int i) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i = i / 10;
        }
        return sum;
    }
}
