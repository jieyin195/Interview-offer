package 揭尹.三刷算法题.No21_调整数组顺序使奇数位位于偶数前面;

public class Solution {
    public int[] exchange(int[] nums) {
        if(nums==null||nums.length==0)
            return nums;
        int left=0,right=nums.length-1;
        while(left<right){
            while(left<right&&!even(nums[left]))
                left++;
            while(left<right&&even(nums[right]))
                right--;
            if(left<right){
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }
        return nums;
    }

    private boolean even(int num) {
        return (num&1)==0;
    }
}
