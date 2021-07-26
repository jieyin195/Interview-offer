package 揭尹.三刷算法题.No3_数组中重复的数字;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }else {
                    int tmp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        return -1;
    }
}
