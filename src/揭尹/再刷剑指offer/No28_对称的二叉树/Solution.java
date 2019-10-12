package 揭尹.再刷剑指offer.No28_对称的二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 17:48
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    boolean isSymmetrical( TreeNode root)
    {
        return isSymmetrical(root,root);
    }

    boolean isSymmetrical(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null||root2==null)
            return false;
        if(root1.val!=root2.val)
            return false;
        return isSymmetrical(root1.left,root2.right)&&isSymmetrical(root1.right,root2.left);
    }
}
