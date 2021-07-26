package 揭尹.三刷算法题.No7_重建二叉树;

import 揭尹.再刷剑指offer.structure.TreeNode;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode buildTree(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight) {
        if(preLeft>preRight||inLeft>inRight)
            return null;
        TreeNode root = new TreeNode(preorder[preLeft]);
        for (int i = inLeft; i <= inRight ; i++) {
            if(preorder[preLeft]==inorder[i]){
                root.left = buildTree(preorder,preLeft+1,preLeft+(i-inLeft),inorder,inLeft,i-1);
                root.right= buildTree(preorder,preLeft+(i-inLeft)+1,preRight,inorder,i+1,inRight);
                break;
            }
        }
        return root;
    }
}
