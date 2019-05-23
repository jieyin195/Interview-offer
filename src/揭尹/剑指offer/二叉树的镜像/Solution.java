package 揭尹.剑指offer.二叉树的镜像;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/18
 * \* Time: 16:49
 * \* To change this template use File | Settings | File Templates.
 * \* Description:二叉树的镜像定义：源二叉树
                               8
                             /  \
                             6   10
                            / \  / \
                            5  7 9 11
                             镜像二叉树
                               8
                             /  \
                            10   6
                           / \  / \
                          11 9 7  5
 * \
 */

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Solution {
    public void Mirror(TreeNode root) {
        TreeNode tmp = null;
        if(root!=null){
            tmp = root.left;
            root.left=root.right;
            root.right=tmp;
            if(root.left!=null)
                Mirror(root.left);
            if(root.right!=null)
                Mirror(root.right);
        }
    }
}
