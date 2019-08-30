package 揭尹.再刷剑指offer.No3_2不修改数组找出重复的数字;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/5
 * \* Time: 16:06
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设只有一个重复的整数，找出这个重复的数。
 *
 * 说明：
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。

 *
 */
public class Solution {
    /**
     * 思路：通过二分法统计数字在数组中出现的次数。此方法无法判断所有重复数，只能找任意一个重复数。
     * 比如：{2,3,5,4,3,2,6,7}，先二分算出middle=4，然后统计1-4区间里面的数在数组中出现的个数，如果大于middle-start+1，则说明
     * 重复出现的数在1-4里面；否则，出现在5-7中。1-4再接着分成1-2,3-4。1-2只有2个数；那么3-4中求middle=3，统计出3有2个，
     * end=middle=3。
     * 最后一次循环了，start==end==3，三又有2个，返回start。
     * @param nums
     * @return
     */
    public int findDuplicate(int[] nums) {

        if(nums==null || nums.length<=0)
            return -1;
        int start=1;
        int end=nums.length-1;
        while(start<=end){
            int middle = (end-start)/2+start;
            int count = countRange(nums,start,middle);
            if(start==end){
                if(count>1)
                    return start;
                else
                    return -1;
            }
            if(count>middle-start+1)
                end=middle;
            else
                start=middle+1;
        }
        return -1;
    }

    private int countRange( int[] nums, int start, int end ) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=start && nums[i]<=end)
                count++;
        }
        return count;
    }
}
