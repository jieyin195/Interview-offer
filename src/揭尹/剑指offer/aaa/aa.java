package 揭尹.剑指offer.aaa;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jline on 2019/3/13.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class aa {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre,int [] post) {
        for (int i = 0; i < post.length; ++i) {
            map.put(post[i],i);
        }
        return reConstructBinaryTree(pre , 0 , pre.length-1 , post , 0 , post.length-1);

    }

    //    int[] pre = {1,2,4,7,3,5,6,8};
//    int[] post = {7,4,2,5,8,6,3,1};
    private TreeNode reConstructBinaryTree( int[] pre, int preStar, int preEnd, int[] post, int postStar, int postEnd ) {
        if(preStar>preEnd||postStar>postEnd)
            return null;
        TreeNode root = new TreeNode(pre[preStar]);

        if(preStar+1<=preEnd){
            int i =map.get(pre[preStar+1]);
            root.left=reConstructBinaryTree(pre,preStar+1 , preStar+(i-postStar)+1,post,postStar,i);
            root.right=reConstructBinaryTree(pre,preStar+(i-postStar+1)+1,preEnd,post,i+1,preEnd-1);

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
        aa solution = new aa();
        TreeNode root = solution.reConstructBinaryTree(pre,post);
        solution.preOrder(root);
        System.out.println();
        solution.inOrder(root);
        System.out.println();
        solution.postOrder(root);
    }
}
