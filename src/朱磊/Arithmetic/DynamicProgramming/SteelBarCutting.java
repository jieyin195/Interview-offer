package 朱磊.Arithmetic.DynamicProgramming;

/**
 * @Author: zl
 * @Date: 2019/3/11 12:23
 * @Description:   长度  1   2   3   4   5   6   7   8   9   10
 *                  价格  1   5   8   9   10  17  17  20  24  30
 *                  给定一段长度为n英寸的钢条和一个价格表pi（i = 1，2，3...，n），求切割钢条方案，使得销售利益rn最大
 */
public class SteelBarCutting {

    public static void main(String[] args) throws Exception {

        int[] p = {1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int n = 4;

        int R1 = recursionSolution(p, n);
        System.out.println(R1);

        System.out.println("-------------------------------------");

        // 首先初始化备忘录。memo为备忘录数组
        int[] memo = new int[p.length + 1];
        for (int i = 0; i < memo.length; i++)
            memo[i] = -1;
        int R2 = memoSolution(p, p.length, memo);
        System.out.println(R2);
        // 这里输出memo最大利润备忘录数组（1-10）
        for (int i = 1; i < memo.length; i++)
            System.out.print(memo[i] + " ");
        System.out.println();

        System.out.println("-------------------------------------");

        int[] res = new int[p.length + 1];
        int R3 = buttomToUpSolution(p, res);
        System.out.println(R3);
        for (int i = 1; i < res.length; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }

    /**
     * @param p 各个不同长度钢条的价格
     * @param n 现有钢条的总长度
     * @return  返回最高利润
     */
    // 递归法
    private static int recursionSolution(int[] p, int n) {
        if(n == 0)  return 0;
        int res = 0;

        for(int i = 1; i <= n; i++)
            res = Math.max(res, p[i - 1] + recursionSolution(p, n - i));

        return res;
    }

    // 备忘录法(备忘录中分别存的是不同长度的最高利润)
    private static int memoSolution(int[] p, int n, int[] memo){

        int res = 0;

        if(n == 0)
            return 0;
        else
            for (int i = 1; i <= n; i++)
                res = Math.max(res, memoSolution(p, n - i, memo) + p[i - 1]);
        memo[n] = res;

        return res;
    }

    // 自底向上的动态规划
    private static int buttomToUpSolution(int[] p, int[] memo){

        for (int i = 1; i <= p.length; i++) {
            int res = 0;
            for (int j = 1; j <= i; j++)    // 在每次循环中选取到最大的利润
                res = Math.max(res, p[j - 1] + memo[i - j]);
            memo[i] = res;
        }

        return memo[p.length];
    }
}
