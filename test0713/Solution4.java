package test0704;

/**
 * @Author:wangrui
 * @Date:2020/7/4 10:17
 */
/*
 * 功能描述:操作给定的二叉树，将其变换为源二叉树的镜像。
 * @return 
 */
public class Solution4 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return ;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
