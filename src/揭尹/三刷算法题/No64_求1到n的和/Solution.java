package 揭尹.三刷算法题.No64_求1到n的和;

public class Solution {
    public int sumNums(int n) {
        boolean x = n>1 && (n+=sumNums(n-1))>1;
        return n;
    }
}
