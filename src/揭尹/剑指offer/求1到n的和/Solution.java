package 揭尹.剑指offer.求1到n的和;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/28
 * \* Time: 17:19
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case
 * 等关键字及条件判断语句（A?B:C）。
 */
public class Solution {
    public int Sum_Solution(int n) {
        int sum =n ;
        boolean flag = (sum>0) && ((sum+=Sum_Solution(--n))>0);
        return sum;
    }
}
