package test0704;

/**
 * @Author:wangrui
 * @Date:2020/7/4 9:54
 */
/*
 * 功能描述:求二叉树的深度
 * @return
 */
public class Solution2 {
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return Math.max(left, right) + 1;
    }
}