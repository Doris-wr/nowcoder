package test0706;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;

/**
 * @Author:wangrui
 * @Date:2020/7/6 13:20
 */
import java.util.ArrayList;
import java.util.*;
class Node {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public Node(int val) {
        this.val = val;
    }
}
public class Solution3 {
    ArrayList<ArrayList<Integer> > Print(Node root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp=new ArrayList<>();
        LinkedList<Node> p=new LinkedList<>();
        if(root==null){
            return ret;
        }
        p.add(root);
        int i=1,j=0;
        while(!p.isEmpty()){
            Node t=p.remove();
            i--;
            temp.add(t.val);
            if(t.left!=null){
                p.add((Node) t.left);
                j++;
            }
            if(t.right!=null){
                p.add((Node) t.right);
                j++;
            }
            if(i==0){
                ret.add(new ArrayList(temp));
                temp.clear();
                i=j;
                j=0;
            }
        }
        return ret;
    }
}
