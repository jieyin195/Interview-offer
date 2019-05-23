package 揭尹.剑指offer.二叉树转换成双向链表;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/5/23
 * \* Time: 9:54
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    /*
    中序遍历
     */
    TreeNode head = null;
    TreeNode realHead = null;
    public TreeNode Convert(TreeNode root) {
      ConvertSub(root);
      return realHead;
    }

    private void ConvertSub( TreeNode root ) {
        if(root==null) return;
        ConvertSub(root.left);
        if(head==null){
            realHead =head = root;
        }else {
            head.right=root;
            root.left=head;
            head = root;
        }
        ConvertSub(root.right);
    }
}
