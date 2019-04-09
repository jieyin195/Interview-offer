package 朱磊.Arithmetic.DynamicProgramming.最大路径;

import java.util.Scanner;

/**
 * @Author: zl
 * @Date: 2019/3/11 19:12
 * @Description:  输入一个三角形数塔，顶点为根节点，每个节点存放一个整数。自底向上走，找出最大路径
 *              例如：             13
 *                              11    8
 *                            12    7   26
 *                           6   14   15   8
 *                         12  7   13   24   11
 */
public class MaxPath {

    public static void main(String[] args) {

        System.out.println("输入三角形的行数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][n + 1];    // 输入矩阵
        int[][] memo = new int[n + 1][n + 1];   // 用于记录对应于输入矩阵，最大路径和
        int[] path = new int[n + 1];    // 最短路径数组
        System.out.println("输入三角形矩阵：");
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++)
                arr[i][j] = sc.nextInt();
        // 对记录
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= i; j++)
                memo[i][j] = -1;

        // 递推求解
        for (int i = 0; i < n; i++)
            memo[n][i] = arr[n][i];
        path[0] = arr[0][0];
        for (int i = n - 1; i >= 0; i--)
            for (int j = 0; j <= i; j++) {
                // 判断当选取当前路径和下一路径和最大的值，为保留下来的最大值，存放在memo数组里面
//                memo[i][j] = arr[i][j] + (memo[i + 1][j] > memo[i + 1][j + 1] ? memo[i + 1][j] : memo[i + 1][j + 1]);
                if(memo[i + 1][j] > memo[i + 1][j + 1]){
                    memo[i][j] = arr[i][j] + memo[i + 1][j];
                    path[i + 1] = arr[i + 1][j];
                }
                else{
                    memo[i][j] = arr[i][j] + memo[i + 1][j + 1];
                    path[i + 1] = arr[i + 1][j + 1];
                }
            }

        // 对最大路径进行输出
        for (int i = 0; i < n; i++)
            System.out.print(path[i] + " ");
        System.out.println("sum：" + memo[0][0]);

        System.out.println("---------------------------------------");
        
        System.out.println(recursiveSolution(arr, memo, 0, 0, n));
        sc.close();
    }

    // 递归做法，思路相同，只不过用递归的思想解决了问题
    private static int recursiveSolution(int[][] arr, int[][] memo, int i, int j, int n) {
        if(i == n)  return memo[i][j] = arr[i][j];

        if(recursiveSolution(arr, memo, i + 1, j, n) > recursiveSolution(arr, memo, i + 1, j + 1, n))
            return  memo[i][j] = arr[i][j] + recursiveSolution(arr, memo, i + 1, j, n);
        else
            return  memo[i][j] = arr[i][j] + recursiveSolution(arr, memo, i + 1, j + 1, n);
    }
}
