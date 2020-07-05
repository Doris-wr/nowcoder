package test0705;

/**
 * @Author:wangrui
 * @Date:2020/7/5 15:32
 */

/*
 * 功能描述:输入一个链表，反转链表后，输出新链表的表头。
 * @return 
 */
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution4 {
    public ListNode ReverseList(ListNode head) {
        ListNode prev = null;
        ListNode next=null;
        ListNode cur=head;
        if(head==null||head.next==null){
            return head;
        }
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}