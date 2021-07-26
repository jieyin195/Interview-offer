package 揭尹.三刷算法题.No15_二进制中1的个数;

public class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n&=n-1;
            count++;
        }
        return count;
    }
}
