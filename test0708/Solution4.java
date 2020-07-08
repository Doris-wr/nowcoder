package test0708;

/**
 * @Author:wangrui
 * @Date:2020/7/8 8:17
 */

/*

*/
class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

public class Solution4 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root2==null) return false;
        if(root1==null&&root2!=null)  return false;
        boolean flag=false;
        if(root1.val==root2.val){
            flag=isSubTree(root1,root2);
        }
        if(!flag){
            flag=isSubTree(root1.left,root2);
            if(!flag){
                flag=isSubTree(root1.right,root2);
            }
        }
        return flag;
    }
    public boolean isSubTree(TreeNode root1,TreeNode root2){
        if(root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1.val==root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }else{
            return false;
        }
    }
}