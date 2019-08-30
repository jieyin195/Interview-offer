package 揭尹.再刷剑指offer.No3_1数组中重复的数字;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 14:11
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || length==0){
            return false;
        }
        /*
            先判断数组中的第一个数是否跟角标i是相同的，相同的话就i++，不相同的话就判断这个数（M）与num[M]比较是否相同，不相同
            就换位置，保证M角标的数就是M。换完位置后第一个数继续跟i比较，所以要有while循环
            while最多执行
         */
        for (int i = 0; i < length; i++) {
            while(numbers[i]!=i){
                if(numbers[i]==numbers[numbers[i]]){
                    duplication[0]=numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return false;
    }
}
