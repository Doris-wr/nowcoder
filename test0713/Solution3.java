package test0704;

/**
 * @Author:wangrui
 * @Date:2020/7/4 10:15
 */
/*
 * 功能描述:输入一棵二叉树，判断该二叉树是否是平衡二叉树。
在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 * @return 
 */
public class Solution3 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        if(left-right>=-1&&left-right<=1){
            return true;
        }
        return false;
    }
    public static int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return Math.max(right,left)+1;
    }
}