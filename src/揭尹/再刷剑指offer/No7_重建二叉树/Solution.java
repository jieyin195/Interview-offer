package 揭尹.再刷剑指offer.No7_重建二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Jline
 * \* Date: 2019/8/6
 * \* Time: 15:35
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class Solution {
    public TreeNode reConstructBinaryTree( int [] pre, int [] in) {
        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
    }

    private TreeNode reConstructBinaryTree( int[] pre, int preStar, int preEnd, int[] in, int inStar, int inEnd ) {
        if(preStar>preEnd||inStar>inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStar]);
        for (int i = inStar; i <= inEnd ; i++) {
            if(pre[preStar]==in[i]){
                root.left=reConstructBinaryTree(pre,preStar+1,preStar+(i-inStar),in,inStar,i-1);
                root.right=reConstructBinaryTree(pre,preStar+(i-inStar)+1,preEnd,in,i+1,inEnd);
                break;
            }
        }
        return root;
    }
}
