package 揭尹.剑指offer.树的子结构;

/**
 * Created by Jline on 2019/4/5.
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
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val)
                return digui(root1,root2);
            if(!result)
                return HasSubtree(root1.left,root2);
            if(!result)
                return HasSubtree(root1.right,root2);
        }
        return result;

    }

    private boolean digui( TreeNode root1, TreeNode root2 ) {
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val!=root2.val)
            return false;

        return digui(root1.left,root2.left)&&digui(root1.right,root2.right);
    }
}
