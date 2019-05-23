package 揭尹.LeetCode.No120;

/**
 * Created by Jline on 2019/3/27.
 */
public class Solution {
    public static void main( String[] args ) {
        int[] p = new int[]{1,5,8,9,10,17,17,20,24,30};
        int[] memo = new int[p.length+1];
        for (int i = 0; i < memo.length; i++) {
            memo[i]=-1;
        }
        System.out.println(cut2(p,4,memo));
    }
    /*
    递归法
     */
    public static int cut(int []p,int n)
    {
        if(n==0)
            return 0;
        int q=-1;
        for(int i=1;i<=n;i++)
        {
            q=Math.max(q, p[i-1]+cut(p, n-i));
        }
        return q;
    }

    /*
    备忘录法
     */

    public static int cut(int []p,int n,int[] memo){
        if(n==0)
            return 0;
        if(memo[n]!=-1)
            return memo[n];
        int q=-1;
        for (int i = 1; i <= n; i++) {
            q=Math.max(q,p[i-1]+cut(p,n-i,memo));
        }
        memo[n]=q;
        return memo[n];
    }

    /*
    动态规划法
     */

    public static int cut2(int []p,int n,int[] memo){
        if(n==0)
            return 0;
        memo[0]=0;
        for (int i = 1; i <= n; i++) {
                //对memo[i]再进行分解
            for (int j = 1; j <= i ; j++) {
                //把memo[i]再分成 j 和 i-j
                memo[i]=Math.max(memo[i],p[j-1]+memo[i-j]);
            }
        }
        return memo[n];
    }
}
