package 揭尹.剑指offer.重建二叉树_先序和中序;

/**
 * Created by Jline on 2019/3/12.
 */

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Solution {
    /**
     * 根据先序和中序遍历求二叉树
     * @param pre
     * @param in
     * @return
     */

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {

        return reConstructBinaryTree(pre , 0 , pre.length-1 , in , 0 , in.length-1);
    }

    private TreeNode reConstructBinaryTree(int[] pre , int preStar,int preEnd,int[] in ,int inStar,int inEnd){
        if(preStar>preEnd || inStar > inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStar]);
        for (int i = inStar; i <= inEnd; i++) {
                if(pre[preStar]==in[i]){
                    root.left = reConstructBinaryTree(pre , preStar+1 , preStar+(i-inStar) , in ,inStar,i-1);
                    root.right = reConstructBinaryTree(pre , preStar+(i-inStar)+1 , preEnd ,in , i+1,inEnd);
                    break;
                }
        }
        return root;
    }

    public void preOrder(TreeNode root){
        if(root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root == null)
            return;

        inOrder(root.left);
        System.out.print(root.val+ " ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(+root.val+ " ");
    }

    public static void main( String[] args ) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Solution solution = new Solution();
        TreeNode root = solution.reConstructBinaryTree(pre,in);
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();
        solution.postOrder(root);
    }
}
