package 揭尹.再刷剑指offer.No26_树的子结构;

import 揭尹.再刷剑指offer.structure.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/9/14
 * \* Time: 16:25
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null)
            return false;
        if (root1.val == root2.val) {
            if (tree1HasTree2FromRoot(root1, root2))
                return true;
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean tree1HasTree2FromRoot(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;

        if (root1.val == root2.val && tree1HasTree2FromRoot(root1.left, root2.left) && tree1HasTree2FromRoot(
                root1.right, root2.right
        ))
            return true;
        else
            return false;
    }
}
