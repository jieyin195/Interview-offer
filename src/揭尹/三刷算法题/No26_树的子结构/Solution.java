package 揭尹.三刷算法题.No26_树的子结构;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if(A==null||B==null)
            return false;
        if(A.val==B.val){
            if(recur(A,B)){
                return true;
            }
        }
        return isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    private boolean recur(TreeNode A, TreeNode B) {
        if(B==null)
            return true;
        if(A==null)
            return false;
        if(A.val==B.val&&recur(A.left,B.left)&&recur(A.right,B.right))
            return true;
        else
            return false;
    }
}
