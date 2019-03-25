package 朱磊.LeetCode.No687;

/**
 * @Author: zl
 * @Date: 2019/3/24 13:20
 * @Description: 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *                 注：是路径不是节点，两个节点之间只有一条路径
 */
public class LongestUnivaluePath {

    public static void main(String[] args) {

    }

    int longestPath;    // 将路径最大长度设置为全局变量，用于在方法中进行记录
    public int longestUnivaluePath(TreeNode root) {
        longestPath = 0;
        deepPath(root);
        return longestPath;
    }

    private int deepPath(TreeNode node) {
        if(node == null)
            return 0;
        // 分别从左边和右边依次递归到叶子节点
        int left = deepPath(node.left);
        int right = deepPath(node.right);
        int curLeft = 0, curRight = 0;  // 用于记录左边和右边保留的最长路径
        if(node.left != null && node.left.val == node.val)
            curLeft = left + 1;
        if(node.right != null && node.right.val == node.val)
            curRight = right + 1;
        longestPath = Math.max(longestPath, curLeft + curRight);   // 全局变量保存当前最大路径
        return Math.max(curLeft, curRight); // 最后保存当前最大一侧的路径长度
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
