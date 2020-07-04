package test0704;
/**
 * @Author:wangrui
 * @Date:2020/7/3 22:01
 */
/*
 * 功能描述:判断一颗二叉树是否是对称的
 * @return
 */
class TreeNode{
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;

    }
}
public class Solution1 {
    boolean isSymmetrical(TreeNode root)
    {
        if(root==null){
            return true;
        }
        return isMirror(root.left, root.right);
    }
    boolean isMirror(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p!=null&&q!=null){
            return (p.val==q.val)&&isMirror(p.left,q.right)&&isMirror(p.right,q.left);
        }
        return false;
    }
}