package 揭尹.剑指offer.数组_数字在排序数组中出现的次数;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/27
 * \* Time: 9:31
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \  统计一个数字在排序数组中出现的次数。
 */
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==k)
                count++;
        }
        return count;
    }
}
