package 揭尹.再刷剑指offer.No27_二叉树的镜像;

import 揭尹.再刷剑指offer.structure.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 17:30
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public void Mirror( TreeNode root) {
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
