package 揭尹.三刷算法题.No33_二叉搜索树的后序遍历序列;

public class Solution {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder==null||postorder.length==0)
            return false;
        return verifyPostorder(postorder,0,postorder.length-1);
    }

    private boolean verifyPostorder(int[] postorder, int l, int r) {
        if(l>=r)
            return true;
        int i= r-1;
        while(i>=l&&postorder[i]>postorder[r])
            i--;
        for (int j = i; j >=l ; j--) {
            if(postorder[j]>postorder[r])
                return false;
        }
        return verifyPostorder(postorder,l,i)&&verifyPostorder(postorder,i+1,r-1);
    }
}
