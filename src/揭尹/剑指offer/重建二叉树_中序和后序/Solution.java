package 揭尹.剑指offer.重建二叉树_中序和后序;

/**
 * Created by Jline on 2019/3/13.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    /**
     * 中序和后序遍历构建二叉树
     * @param in
     * @param post
     * @return
     */
    public TreeNode reConstructBinaryTree(int [] in,int [] post) {

        return reConstructBinaryTree(in , 0 , in.length-1 , post , 0 , post.length-1);
    }

    private TreeNode reConstructBinaryTree(int [] in,int inStar,int inEnd,int[] post,int postStar,int postEnd){
        if(inStar > inEnd || postStar>postEnd)
            return null;
        TreeNode root = new TreeNode(post[postEnd]);
        for (int i = inStar; i <=inEnd; i++) {
            if(post[postEnd] == in[i]){
                root.left = reConstructBinaryTree(in,inStar,i-1,post,postStar,postStar+(i-inStar-1));
                root.right = reConstructBinaryTree(in,i+1,inEnd,post,postStar+(i-inStar),postEnd-1);
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
        int[] in = {4,7,2,1,5,3,8,6};
        int[] post = {7,4,2,5,8,6,3,1};
        Solution solution = new Solution();
        TreeNode root = solution.reConstructBinaryTree(in,post);
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();
        solution.postOrder(root);
    }
}
