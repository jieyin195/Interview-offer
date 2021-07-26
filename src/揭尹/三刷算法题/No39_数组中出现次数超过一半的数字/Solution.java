package 揭尹.三刷算法题.No39_数组中出现次数超过一半的数字;

public class Solution {
    public int majorityElement(int[] nums) {
        int votes=0,x=0,count=0;
        for(int num:nums){
            if(votes==0)
                x=num;
            if(x==num)
                votes+=1;
            else
                votes-=1;
        }
        for(int num:nums){
            if(num==x)
                count++;
        }
        return count>nums.length/2?x:-1;
    }
}
