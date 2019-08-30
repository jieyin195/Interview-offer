package 揭尹.剑指offer.数组_丑数;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/24
 * \* Time: 11:25
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution {
    public static int GetUglyNumber_Solution(int index) {
            /**
             * 1.首先把2存进res[1]中，然后再判断res[1]是由res[t2] * 2, Math.min(res[t3] * 3, res[t5] * 5
             * 中哪个算的，对应的角标+1(解释角标为什么会加1，起始角标都是0且值为1的数，通过res[1]找到了2的
             * 公倍数2，那么就说明res[t2]已经找到公倍数了，接下来会用公倍数2去计算。到i=2的时候，res[2]等于3，
             * 那么约数3也找到了公倍数3.)
             * 总结：就是根据约数找他们的公倍数。
             */
            if(index<7) return index;
            int[] res = new int[index];
            res[0]=1;
            int t2=0,t3=0,t5=0;
        for (int i = 1; i <index ; i++) {
            res[i]=Math.min(res[t2]*2,Math.min(res[t3]*3,res[t5]*5));
            if(res[i]==res[t2]*2) t2++;
            if(res[i]==res[t3]*3) t3++;
            if(res[i]==res[t5]*5) t5++;
        }
        return res[index-1];
    }

    public static void main( String[] args ) {
        System.out.println(GetUglyNumber_Solution(11));
    }
}
