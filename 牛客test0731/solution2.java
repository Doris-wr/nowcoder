package 牛客test0731;

import java.util.Stack;

/**
 * @Author:wangrui
 * @Date:2020/7/31 11:17
 */
import java.util.*;
/*
 * 功能描述:给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 * @return
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class solution2 {
    TreeNode KthNode(TreeNode root, int k){
        if(root==null||k<0){
            return null;
        }
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        do{
            while(node!=null){
                stack.push(node);
                node=node.left;
            }
            if(!stack.isEmpty()){
                node=stack.pop();
                k--;
                if(k==0){
                    return node;
                }
                node=node.right;
            }
        }while(node!=null||!stack.isEmpty());
        return null;
    }
}