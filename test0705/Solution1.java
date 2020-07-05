package test0705;

/**
 * @Author:wangrui
 * @Date:2020/7/5 12:13
 */
/*
 * 功能描述:输入一个链表，输出该链表中倒数第k个结点。
 * @return 
 */ 
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution1 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k <= 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k - 1 >0) {
            if (fast != null) {
                fast = fast.next;
                k--;
            } else {
                System.out.println("没有这个节点");
                return null;
            }
        }
        if(fast==null){
            return null;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}