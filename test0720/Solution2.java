package test0720;

/**
 * @Author:wangrui
 * @Date:2020/7/20 23:27
 */

import java.util.*;
class TreeNode2 {
 int val = 0;
 TreeNode2 left = null;
 TreeNode2 right = null;

 public TreeNode2(int val) { this.val = val; }
 }
public class Solution2 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode2 root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode2> queue = new ArrayList<>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode2 temp = queue.remove(0);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}
