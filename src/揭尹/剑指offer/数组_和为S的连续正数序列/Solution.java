package 揭尹.剑指offer.数组_和为S的连续正数序列;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/27
 * \* Time: 15:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 * 现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 * 输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */
public class Solution {
    /**
     * 双指针滑动窗口
     * @param sum
     * @return
     */
    public ArrayList<ArrayList<Integer>> FindContinuousSequence( int sum) {
        ArrayList<ArrayList<Integer>> bigList = new ArrayList<>();
        int plow =1 , phigh=2;
        while(plow<phigh){
            int cur = (plow+phigh)*(phigh-plow+1)/2;
            if(cur==sum){
                ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = plow; i <=phigh ; i++) {
                    arrayList.add(i);
                }
                bigList.add(arrayList);
                plow++;
            }else if(cur < sum)
                phigh++;
            else
                plow++;
        }
        return bigList;
    }
}