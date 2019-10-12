package 揭尹.再刷剑指offer.No12_矩阵中的路径;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 21:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public boolean hasPath( char[] matrix, int rows, int cols, char[] str ) {
        boolean[] visited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathCore(matrix, rows, cols, i, j, visited, str, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean hasPathCore( char[] matrix, int rows, int cols, int i, int j, boolean[] visited, char[] str, int k ) {
        int index = i * cols + j;
        if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || visited[index] == true)
            return false;
        if (k == str.length - 1)
            return true;
        visited[index] = true;
        if (hasPathCore(matrix, rows, cols, i + 1, j, visited, str, k + 1) ||
                hasPathCore(matrix, rows, cols, i - 1, j, visited, str, k + 1) ||
                hasPathCore(matrix, rows, cols, i, j + 1, visited, str, k + 1) ||
                hasPathCore(matrix, rows, cols, i, j - 1, visited, str, k + 1))
            return true;
        visited[index] = false;
        return false;
    }
}
