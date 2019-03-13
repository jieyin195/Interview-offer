package 揭尹.剑指offer.重建二叉树_先序和后序;

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
    public TreeNode reConstructBinaryTree(int [] pre,int [] post) {
        return reConstructBinaryTree(pre , 0 , pre.length-1 , post , 0 , post.length-1);
    }

    private TreeNode reConstructBinaryTree( int[] pre, int preStar, int preEnd, int[] post, int postStar, int postEnd ) {
        if(preStar>preEnd||postStar>postEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStar]);
        for (int i = postStar ; i <=postEnd ; i++) {
            if(preStar+1<=preEnd && pre[preStar+1] == post[i]){
                root.left=reConstructBinaryTree(pre,preStar+1 , preStar+(i-postStar)+1,post,postStar,i);
                root.right=reConstructBinaryTree(pre,preStar+(i-postStar+1)+1,preEnd,post,i+1,preEnd-1);
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
        int[] post = {7,4,2,5,8,6,3,1};
        Solution solution = new Solution();
        TreeNode root = solution.reConstructBinaryTree(pre,post);
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();
        solution.postOrder(root);
    }
}
