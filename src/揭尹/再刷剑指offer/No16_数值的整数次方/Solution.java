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
        if(base ==0)
            return 0;
        long n= exponent;
        double res = 1;
        if(n<0){
            base = 1/base;
            n = -n;
        }
        while(n>0){
            if((n&1)==1)
                res*=base;
            base*=base;
            n>>=1;
        }
        return res;
    }

    public static void main( String[] args ) {
        System.out.println(Power(2,-1));
        System.out.println();
    }
}
