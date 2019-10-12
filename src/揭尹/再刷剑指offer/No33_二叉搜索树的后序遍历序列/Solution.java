package 揭尹.再刷剑指offer.No33_二叉搜索树的后序遍历序列;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/15
 * \* Time: 13:35
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] arr) {
        if(arr.length==0)
            return false;
        return VerifySquenceOfBST(arr,0,arr.length-1);
    }
    private boolean VerifySquenceOfBST(int[] arr,int l,int r){
        if(l==r)
            return true;
        int i =r-1;
        while(i>=l&&arr[i]>arr[r])
            i--;
        for (int j = i; j >=l ; j--) {
            if(arr[j]>arr[r])
                return false;
        }
        return VerifySquenceOfBST(arr,l,i)&&VerifySquenceOfBST(arr,i+1,r-1);
    }
}
