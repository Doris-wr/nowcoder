package test0724;

/**
 * @Author:wangrui
 * @Date:2020/7/24 14:32
 */
import java.util.*;
class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

     public TreeNode(int val) {
          this.val = val;
     }

 }
/*
 * 功能描述:而二叉树的层序遍历
 * @return
 */
public class Solution3 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode remove=queue.poll();
            list.add(remove.val);
            if(remove.left!=null){
                queue.offer(remove.left);
            }
            if(remove.right!=null){
                queue.offer(remove.right);
            }
        }
        return list;
    }
}