package 揭尹.剑指offer.二叉搜索树的后序遍历序列;

import java.util.ArrayList;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/19
 * \* Time: 19:36
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 *  如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 */

//递归
public class Solution {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence.length==0)
            return false;
        return judge(sequence,0,sequence.length-1);
    }

    private boolean judge( int[] sequence, int l, int r ) {
        if(l>=r)
            return true;
        int i =r-1;
        while(i>l&&sequence[i]>sequence[r]) i--;
        for (int j = i; j >=l ; j--) {
            if(sequence[j]>sequence[r]) return false;
        }
        return judge(sequence,l,i) && judge(sequence,i+1,r-1);
    }

}
