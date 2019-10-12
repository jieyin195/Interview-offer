package 揭尹.再刷剑指offer.No16_数值的整数次方;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/12
 * \* Time: 13:17
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public static double Power(double base, int exponent) {
        int n = Math.abs(exponent);
        if(n==0)
            return 1;
        if(n==1)
            return base;
        double res = Power(base,n>>1);
        res*=res;
        if((n&1)==1){
            res*=base;
        }
        if(exponent < 0) // 如果指数为负数，则应该求result的倒数
            res = 1 / res;
        return res;
    }

    public static void main( String[] args ) {
        Power(2,-1);
        System.out.println();
    }
}
