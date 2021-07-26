package 揭尹.三刷算法题.No29_顺时针打印矩阵;

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[]{};
        int n = matrix.length, m = matrix[0].length;
        int[] arr = new int[n * m];
        int count = 0;
        int layers = (int) Math.ceil(Math.min(n, m) / 2.0);
        for (int i = 0; i < layers; i++) {
            for (int k = i; k < m - i; k++) {
                arr[count++] = matrix[i][k];
            }
            for (int j = i + 1; j < n - i; j++) {
                arr[count++] = matrix[j][m-i-1];
            }
            for (int k = m-i-2; k>=i&& n-i-1!=i ; k--) {
                arr[count++] = matrix[n-i-1][k];
            }
            for (int j = n-i-2; j>i && m-i-1!=i ; j--) {
                arr[count++] = matrix[j][i];
            }
        }
        return arr;
    }
}
