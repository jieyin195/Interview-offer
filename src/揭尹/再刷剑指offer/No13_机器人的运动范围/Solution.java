package 揭尹.再刷剑指offer.No13_机器人的运动范围;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/11
 * \* Time: 23:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public int movingCount( int threshold, int rows, int cols ) {
        boolean[][] visited = new boolean[rows][cols];
        return movingCountCore(rows, cols, 0, 0, visited, threshold);
    }

    private int movingCountCore( int rows, int cols, int i, int j, boolean[][] visited, int threshold ) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || visited[i][j] || numSum(i) + numSum(j) > threshold)
            return 0;
        visited[i][j] = true;
        return 1 + movingCountCore(rows, cols, i + 1, j, visited, threshold) +
                movingCountCore(rows, cols, i - 1, j, visited, threshold) +
                movingCountCore(rows, cols, i, j + 1, visited, threshold) +
                movingCountCore(rows, cols, i, j - 1, visited, threshold);

    }

    private int numSum( int j ) {
        int count = 0;
        while (j != 0) {
            count += j % 10;
            j = j / 10;
        }
        return count;
    }
}
